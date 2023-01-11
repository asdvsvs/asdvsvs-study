package baekjoon_level;
import java.io.*;
import java.util.*;

public class Baekjoon_25305 {
	public void baekjoon_25305() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(bf.readLine());
		int[] score= new int [N];
		for (int i = 0; i < N; i++) {
			score[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(score);
		bw.write(String.valueOf(score[N-k]));
		bw.flush();
		bw.close();
	}
}
