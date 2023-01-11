package baekjoon_level;
import java.io.*;
import java.util.Arrays;
public class Baekjoon_2750 {
	public void baekjoon_2759() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(bf.readLine());
		int[] arr = new int [N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		Arrays.sort(arr);
		for (int i = 0; i < N; i++) {
			bw.write(String.valueOf(arr[i]));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
