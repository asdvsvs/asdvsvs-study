package baekjoon_level;
import java.io.*;
import java.util.Arrays;
import java.lang.*;

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
//		N개의 수들의 합
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
			sum+=arr[i];
		}
		Arrays.sort(arr);
//		
		for (int i = 0; i < N-1; i++) {
			if(arr[i]==arr[i+1])count[i]++;
			if(i>0 && count[i]>0 && count[i-1]>0)count[i]+=count[i-1];
		}
//		최빈값 개수 구하기
		for (int i = 0; i < N; i++) {
			maxcnt = Math.max(count[i],maxcnt);
		} 
//		최빈값
		for (int i = 0; i < N; i++) {
			if(maxcnt==count[i]) {
				tcnt++;
				temp=arr[i];
				if(tcnt==2){
					temp=arr[i];
					break;
				}
				
			}
		}
//		산술평균 출력
		if((sum%N)*2>=N)bw.write(String.valueOf(sum/N+1)+"\n");
		else if((sum%N)*2<(-1*N) && sum<0)bw.write(String.valueOf(sum/N-1)+"\n");
		else bw.write(String.valueOf(sum/N)+"\n");
//		중앙값 출력
		bw.write(String.valueOf(arr[N/2])+"\n");
//		최빈값 출력
		bw.write(String.valueOf(temp)+ "\n");
//		범위 출력
		bw.write(String.valueOf(arr[N-1]-arr[0]));
		
		bw.flush();
		bw.close();
	}
}
