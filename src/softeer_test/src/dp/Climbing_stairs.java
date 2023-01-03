//www.acmicpc.net/problem/2579
//백준 2579번, 계단오르기

package dp;

import java.util.Scanner;

public class Climbing_stairs {

	public void climbing_stairs() {
		Scanner sc = new Scanner(System.in);
		int stairs = sc.nextInt();
		int[] score = new int[stairs+1];
		for (int i = 1; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		int[] dp = new int[stairs+1];
		dp[0]= 0;
		dp[1]= score[1];
		dp[2]= score[2]+score[1];
		for (int i = 3; i < dp.length; i++) {
			dp[i] = Math.max(score[i]+score[i-1]+dp[i-3], score[i]+dp[i-2]);
		}		
		System.err.println(dp[stairs]);
	}
}