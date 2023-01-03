//https://www.acmicpc.net/problem/15486
//น้มุ 15486น๘, ล๐ป็2

package dp;

import java.util.Scanner;

public class Resign2 {

	public void resign2() {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t = new int[n+1];
		int[] p = new int[n+1];
		for (int i = 1; i < p.length; i++) {
			t[i] = sc.nextInt();
			p[i] = sc.nextInt();
		}
		int[] dp = new int[n+1];
		for (int i = 1; i < dp.length; i++) {
			if (i + t[i] < n+1) {
				dp[i + t[i]] = Math.max(dp[i]+p[i], dp[i+ t[i]]);
				dp[i+1] = Math.max(dp[i+1], dp[i]);
			}
		}
//		dp[1+3] = dp[1]+p[1], dp[1+3];
//		dp[2+5] = dp[2]+p[2], dp[2+7];
//		dp[3+1] = dp[3]+p[3], dp[3+1];
//		dp[4+1] = dp[4]+p[4], dp[4+1];
//		dp[5+2] = dp[5]+p[5], dp[5+2];
//		
//		dp[2] = dp[2], dp[1];
//		dp[3] = dp[3], dp[2];
		
		System.out.println(dp[n]);
	}
}
