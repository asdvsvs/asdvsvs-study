package baekjoon_level;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_11650 {
	public void  baekjoon_11650() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(bf.readLine());
		int[] x = new int[N];
		int[] y = new int[N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		int sortx[]=x;
		int sorty[]= new int[N];
		Arrays.sort(sortx);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(sortx[i]==x[j]){
					sorty[i]=y[j];
					x[j]--;
				}
			}
		}
		int cnt=1;
		int[] arr;
		for (int j = 0; j < N; j++) {
			if(sortx[j]==sortx[j+1]){
				cnt++;
			}
			else{
				arr = new int[cnt];
				for (int i = 0; i < cnt; i++) {
					arr[i]=sorty[i];
					}
				Arrays.sort(arr);
				
				
			}

		}
		
		bw.flush();
		bw.close();
	}
}
