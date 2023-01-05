package baekjoon_level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_10250 {
	public void beaekjoon_10250() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		
		for (int i = 0; i < t; i++) {
			String s = bf.readLine();
			StringTokenizer st = new StringTokenizer(s);
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int xx = N/H +1;
			int yy = N%H;
			if(N%H==0){
				yy=H;
				xx--;
			}
			if(xx<10)System.out.println(yy+""+0+""+xx);
			else System.out.println(yy+""+xx);
		}
		

//		int xx = N%H +1;
//		int yy = N/H +1;
//		System.out.println(yy+""+xx);
	}
}
