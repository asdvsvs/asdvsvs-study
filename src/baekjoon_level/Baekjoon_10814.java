package baekjoon_level;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_10814 {
	public void baekjoon10814() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(bf.readLine());
		String[][] man = new String [N][2];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine());
			man[i][0] = st.nextToken();
			man[i][1] = st.nextToken();
		}
		Arrays.sort(man);
		
		bw.write(String.valueOf(man));
		bw.flush();
		bw.close();
		
	}
}
