// 카운팅 소트(계수 정렬)

package baekjoon_level;
import java.io.*;

public class Baekjoon_10989 {
	public void baekjoon_10989() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine());
		int[] arr = new int [N];
		int[] count = new int [10001];
		int[] result = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
			count[arr[i]]++;
		}
		for (int i = 1; i <= 10000; i++) {
			count[i]+=count[i-1];
		}
		for (int i = N-1; i >= 0; i--) {
			count[arr[i]]--;
			result[count[arr[i]]]=arr[i];
		}
		for (int i = 0; i < N; i++) {
			bw.write(String.valueOf(result[i]));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
