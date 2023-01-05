package baekjoon_level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2869 {
	public void baekjoon_2869() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		int day;
		day = (v-a)/(a-b)+1;
		if((v-a)%(a-b) !=0)day++;
		System.out.println(day);
//		int day=1;
//		while(true){
//			if(v<=a*day-b*(day-1)){
//				System.out.println(day);
//				break;
//			}
//			day++;
//		}
		
	}
}
