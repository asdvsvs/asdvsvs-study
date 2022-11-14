//https://www.acmicpc.net/problem/11726
//���� 11726��, 2xn Ÿ�ϸ�

package dp;

import java.util.Scanner;

public class Tile2xn {
	
	public void tile2xn() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n+1];
		
		dp[0]= 0;
		dp[1]= 1;
		dp[2]= 2;		
		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		System.out.println(dp[n]%10007);
	}

}
