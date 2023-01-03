package baekjoon_level;

import java.io.*;

public class Honeycomb {
	public void honeycomb() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int move=1;
		int t=1;
		
		for (int i = 1; i <= n; i++) {
			if((i-1)/(6*t)==1 && (i-1)%6==1){
				move++;
				t=t+move;
			}
		}
		if(n==1)System.out.println(1);
		else System.out.println(move+1);
	}
}
