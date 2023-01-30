package baekjoon_level;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Baekjoon_18870 {
	public void baekjoon_18870 () throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		ArrayList<Integer> arr = new ArrayList<>();
		
		int N = Integer.parseInt(bf.readLine());
		int[] num = new int [N];
		int[] result = new int[N];
		st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(st.nextToken());
			arr.add(num[i]);
		}
		List<Integer> newarr=arr.stream().distinct().collect(Collectors.toList());
		Collections.sort(newarr);
		for (int i = 0; i < N; i++) {
			result[i]=newarr.indexOf(num[i]);
		}
		for (int i = 0; i < N; i++) {
			bw.write(result[i] +" ");
		}
		
		bw.flush();
		bw.close();
	}
}
