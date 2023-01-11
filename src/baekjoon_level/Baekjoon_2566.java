package baekjoon_level;
import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon_2566 {
	public void baekjoon_2556() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int nmax=0;
		int num;
		int a=0,b=0;
		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(bf.readLine());
			for (int j = 0; j < 9; j++) {
				num = Integer.parseInt(st.nextToken());
				nmax = Math.max(nmax, num);
				if(nmax==num){
					a=i+1;
					b=j+1;
				}
			}
		}
		bw.write(String.valueOf(nmax));
		bw.newLine();
		bw.write(String.valueOf(a)+" "+String.valueOf(b));
		bw.flush();
		bw.close();
	}
}
