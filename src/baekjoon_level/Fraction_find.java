package baekjoon_level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fraction_find {
	public void fraction_find() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int cnt=1;
		int t=4;
		int k=2;
		int x =1;
//		y/x
		
		while(cnt<n ){
			if(x%2==1){
				cnt=cnt+1;
				x++;
			}
			else if(x%2==0){
				if(k>n){
					
				}
				cnt=cnt+t;
				t=t+4;
				x++;
				
			}
			
		}
		
		System.out.println(cnt+" x:"+x);
		
		
//		12 67 1516 2829 4546 6566 8990
//		1 34 1011 2122 3637
	}
}
