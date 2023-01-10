package baekjoon_level;

import java.io.*;
import java.util.StringTokenizer;
public class Baekjoon_2738 {
	public void baekjoon_2738() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer a = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(a.nextToken());
		int M = Integer.parseInt(a.nextToken());
		int[][] NM = new int[N*2][M];
		
		for (int i = 0; i < N*2; i++) {
			String s = bf.readLine();
			StringTokenizer st = new StringTokenizer(s);
			for (int j = 0; j < M; j++) {
				NM[i][j]= Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				NM[i][j]+=NM[i+N][j];
				bw.write(String.valueOf(NM[i][j]));
				bw.write(" ");
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
		
	}
}
