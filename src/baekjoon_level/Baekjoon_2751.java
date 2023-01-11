package baekjoon_level;
import java.io.*;
import java.util.*;

public class Baekjoon_2751 {
	public void baekjoon_2751() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(bf.readLine());
		int[] num = new int [N];
		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(bf.readLine());
		}
		Arrays.sort(num);
		for (int i = 0; i < N; i++) {
			bw.write(String.valueOf(num[i]));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
