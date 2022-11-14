//https://www.acmicpc.net/problem/1463
//백준 1463번, 1로 만들기
package dp;

import java.util.Scanner;

public class Make1 {

	public int make1(int n, int count) {
//		int count =0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("n 입력:");
//		int n= sc.nextInt();
		
//		while(true) {
//			if(n==1) break;
//			else if(n%3 == 0) {
//				n = n/3;
//				count ++;
//			}
//			else if(n%2 ==0) {
//				n = n/2;
//				count ++;
//			}
//			else {
//				n = n-1;
//				count ++;
//			}
//		}
		if (n < 2) return count;
		
		return Math.min(make1(n/2, count +1+(n%2)), make1(n/3, count+1+(n%3)));
	}
}
