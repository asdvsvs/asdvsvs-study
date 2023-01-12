package baekjoon_level;
import java.io.*;
import java.util.Arrays;

public class Baekjoon_2108 {
	public void baekjoon_2108() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine());
		int[] arr = new int [N];
		int sum=0;
		int[] count = new int [N+1];
		int maxcnt=0;
		int temp=0;
		int tcnt=0;
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
			sum+=arr[i];
		}
		Arrays.sort(arr);
		for (int i = 0; i < N-1; i++) {
			if(arr[i]==arr[i+1])count[i]++;
			if(count[i]==1&&count[i+1]==1)count[i]+=count[i+1];
		}
		for (int i = 0; i < N; i++) {
			maxcnt = Math.max(count[i],maxcnt);
		} 
		for (int i = 0; i < N; i++) {
			if(maxcnt==count[i]) {
				tcnt++;
				if(tcnt==1)temp=arr[i];
				else if(tcnt==2){
					temp=arr[i];
					break;
				}
				
			}
		}
		
		bw.write(String.valueOf(sum/N)+"\n");
		bw.write(String.valueOf(arr[N/2])+"\n");
		if(tcnt==1)bw.write(String.valueOf(temp)+ "\n");
		else bw.write(String.valueOf(temp)+"\n");
		bw.write(String.valueOf(arr[N-1]-arr[0]));
		
		bw.flush();
		bw.close();
	}
}
