package baekjoon_level;
import java.io.*;

public class Baekjoon_10989 {
	public void baekjoon_10989() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine());
		int[] arr = new int [N];
		int[] count = new int [10000];
		int[] result = new int[N+1];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
			count[arr[i]]++;
		}
		for (int i = 1; i < 10000; i++) {
			count[i]+=count[i-1];
		}
		for (int i = N-1; i >= 0; i--) {
			result[count[arr[i]]]=arr[i];
			count[arr[i]]--;
		}
		for (int i = 1; i < N+1; i++) {
			bw.write(String.valueOf(result[i]));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
