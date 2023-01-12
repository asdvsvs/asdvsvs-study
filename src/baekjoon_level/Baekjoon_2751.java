// 시간 복잡도가 O(nlogn)인 정렬 알고리즘으로 풀 수 있습니다.예를 들면 병합 정렬, 힙 정렬 등이 있지만,
// 어려운 알고리즘이므로 지금은 언어에 내장된 정렬 함수를 쓰는 것을 추천드립니다.
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
