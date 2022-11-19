package softeer_test;
import java.util.Scanner;
public class Procession_size {
	public void procession_size() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] area = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				area[i][j] = sc.nextInt();
			}
		}
		int k=0;
		int[] size = new int[n*n/2];
		int[][] dp = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(area[i][j]>0) {
					
					if(j<n-1&&area[i][j+1]==1)dp[i][j]=dp[i][j]+1;
//					if(i<n-1&&area[i+1][j]==1)dp[i+1][j]=dp[i+1][j]+1;
					if(j<n-1&&area[i][j+1]==1)size[k]++;
					if(i<n-1&&area[i+1][j]==1)size[k]++;
					if(j<n-1&&area[i][j+1]<1&&i<n-1&&area[i+1][j]<1)k++;
//					if(i>0&&area[i-1][j]<0)k++;
				}
			}
			
		}
		
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				if(dp[i][j]>0)System.out.print(dp[i][j]+" ");
//				else System.out.print(0+" ");
//			}
//			System.out.println();
//		}
		
		for (int i = 0; i < size.length; i++) {
			System.out.println(size[i]);
		}
	}
}
