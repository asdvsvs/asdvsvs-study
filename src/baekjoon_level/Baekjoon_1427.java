package baekjoon_level;
import java.io.*;
import java.util.*;

public class Baekjoon_1427 {
	public void baekjoon_1427() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine());
		int cnt=0;
		for (int i = 1; i <= N; i*=10) cnt++;
		int[] num = new int[cnt];
		
		int jari = (int)Math.pow(10,cnt-1);
		for (int i = 0; i < cnt; i++) {
			num[i] = N/jari;
			N %=jari;
			jari/=10;
		}
		Arrays.sort(num);
		for (int i = cnt-1; i >= 0 ; i--) {
			bw.write(String.valueOf(num[i]));
		}
		bw.flush();
		bw.close();
	}
}
