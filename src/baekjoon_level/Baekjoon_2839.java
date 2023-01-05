package baekjoon_level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2839 {
	public void baekjoon_2839() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		
		int num=0;
		num+=N/5;
		num+=(N%5)/3;
		if((N%5)%3 !=0 && N%3 !=0)num=-1;
	}
}
