//백준 1712번 손익분기점

package baekjoon_level;

import java.io.*;
import java.util.StringTokenizer;

public class Breakeven_point {
	public void breakeven_point() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int num;
		if(c>b){
			num =a/(c-b)+1;
		}
		else num=-1;
		System.out.println(num);
		
	}
}
