package baekjoon_level;
import java.io.*;
import java.util.*;

public class Baekjoon_2587 {
	public void baekjoon_2587() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] n = new int[5];
		int sum=0;
		for (int i = 0; i < 5; i++) {
			n[i]= Integer.parseInt(bf.readLine());
			sum+= n[i];
		}
		Arrays.sort(n);
		bw.write(String.valueOf(sum/5));
		bw.newLine();
		bw.write(String.valueOf(n[2]));
		bw.flush();
		bw.close();
	}
}
