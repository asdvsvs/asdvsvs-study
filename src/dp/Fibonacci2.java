// https://www.acmicpc.net/problem/2748
// 백준 2748, 피보나치2

package dp;

import java.util.Scanner;

public class Fibonacci2 {

	public void fibonacci() {
		int n;
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		
		int[] number = new int[n+1];
		number[0] =0;
		number[1]= 1;
		for (int i = 2; i < n+1; i++) number[i] = number[i-2] + number[i-1]; 

		System.out.print(number[n]);
		
	}
}
