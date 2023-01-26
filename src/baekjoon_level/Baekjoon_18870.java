package baekjoon_level;
import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon_18870 {
	public void baekjoon_18870 () throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(bf.readLine());
		int[] num = new int [N];
		int[] num_sort = new int [N];
		st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(num[i]>num[j]){
					
					num_sort[i]++;
				}
			}
			bw.write(String.valueOf(num_sort[i])+" ");
		}
		
		
		bw.flush();
		bw.close();
	}
}
