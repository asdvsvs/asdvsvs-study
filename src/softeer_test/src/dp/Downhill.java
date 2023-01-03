//https://www.acmicpc.net/problem/1520
//백준 1520번, 내리막길

package dp;

import java.util.Scanner;

public class Downhill {

	public void downhill() {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mp= new int[m+1][n+1];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mp[i][j] = sc.nextInt();
			}
		}
		
		int[][] dp = new int[m+1][n+1];
		
		if(mp[0][0]>mp[0][1]) {
			dp[0][1]=dp[0][0]+1;
			if(dp[0][0]==0)dp[0][0]++;
		}
		if(mp[0][0]>mp[1][0]) {
			dp[1][0]=dp[0][0]+1;
			if(dp[0][0]==0)dp[0][0]++;
		}
						
	
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				
				if(dp[i][j]>0){
//					우로 이동
					if(mp[i][j]>mp[i][j+1]) {
						if(i>0&&dp[i][j+1]>0)
							dp[i][j+1]= dp[i][j+1] + dp[i][j];
						else dp[i][j+1]=dp[i][j];
					}
//					아래이동
					if(mp[i][j]>mp[i+1][j])
						dp[i+1][j]=dp[i][j];
//					좌로 이동
					if(j>0) {
						if(mp[i][j-1]<mp[i][j]) {
							dp[i][j-1]=dp[i][j-1]+1;
							if(mp[i][j-1]>mp[i+1][j-1])
								dp[i+1][j-1]=dp[i][j-1];
							}
						}
					}
				}
			}
		
		System.out.println(dp[m-1][n-1]);

//		----검증구간----
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(dp[i][j]>0)System.out.print(" "+dp[i][j]+ " ");
				else System.out.print(" "+0+ " ");
			}
			System.out.println();
		}
//		----여기까지----
	
	}
}
