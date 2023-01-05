//백준 1193번 못풀고 포기 찾아봄
package baekjoon_level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fraction_find {
	public void fraction_find() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int cnt=0;
		int t=0;
		
		while(true){
			t++;
			cnt +=t;
			if(cnt>=n){
				if(t%2==0){
					System.out.println(n-cnt+t+"/"+(cnt-n+1));
				}
				else{
					System.out.println((cnt-n+1)+"/"+(n-cnt+t));
				}
				break;
			}
				
			
		}
		
	}
}
