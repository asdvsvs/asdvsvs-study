package baekjoon_level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2839 {
	public void baekjoon_2839() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		
		int count;
		int cntmin=N;
		for (int i = 0; i < N/5 +1; i++) {
			if((N-(5*i))%3==0){
				count =i+(N-(5*i))/3;
				cntmin = Math.min(cntmin, count);
			}
		}
		if (cntmin==N)cntmin=-1;
		System.out.println(cntmin);
	}
}
