package baekjoon_level;
import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon_2563 {
	public void baekjoon_2563() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(bf.readLine());
		int x,y;
		boolean[][] xy = new boolean[100][100];
		int cnt=0;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(bf.readLine());
			x= Integer.parseInt(st.nextToken());
			y= Integer.parseInt(st.nextToken());
			for (int j = x; j < x+10; j++) {
				for (int j2 = y; j2 < y+10; j2++) {
					if(xy[j][j2]==true) cnt++;
					xy[j][j2]= true;
				}
			}
		}
		
		bw.write(String.valueOf(100*n -cnt));
		bw.flush();
		bw.close();
	}
}
