package baekjoon_level;

import java.io.IOException;

public class Baekjoon_2775 {
	public int baekjoon_2775(int k,int n) throws IOException{

		if(k==0)return n;
		if(n==1)return 1;
		return baekjoon_2775(k-1,n)+baekjoon_2775(k,n-1);
		
	}
}

//제출코드

//import java.io.*;
//import java.util.*;
//public class Main
//{
//    public static void main(String[] args) throws IOException
//    {
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		int t = Integer.parseInt(bf.readLine());
//		for (int i = 0; i < t; i++) {
//			int k = Integer.parseInt(bf.readLine());
//			int n = Integer.parseInt(bf.readLine());
//			System.out.println(baekjoon_2775(k,n));
//		}
//    }
//    public static int baekjoon_2775(int k,int n) throws IOException{
//		if(k==0)return n;
//		if(n==1)return 1;
//		return baekjoon_2775(k-1,n)+baekjoon_2775(k,n-1);
//	}
//}