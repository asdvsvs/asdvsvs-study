package baekjoon_level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2839 {
	public void baekjoon_2839() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		
		int count;
		for (int i = 0; i < N/5 +1; i++) {
			if((N-(5*i))%3==0){
				count =i+N/3;
				int temp =count;
				count = Math.min(temp, count);
			}
			
			
		}
		
//		int num=0;
//		if((N%5)%3 ==0){
//			num+=N/5;
//			num+=(N%5)/3;
//		}
//		else if((N%5)%3 !=0 && N%3 !=0)num=-1;
//		else num=N/3;
		
		
//		System.out.println(count);
	}
}
