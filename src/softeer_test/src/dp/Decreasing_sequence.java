//https://www.acmicpc.net/problem/11722
//���� 11722�� , ���� �� �����ϴ� �κ� ����

package dp;

import java.util.Scanner;

public class Decreasing_sequence {

	public void decreeasing(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] seq = new int[n+1];
		for (int i = 1; i < seq.length; i++) {
			seq[i] = sc.nextInt();
		}
		int nmax=0;
		int[] dp = new int[n+1];
//		��� dp�� 1 ����
		for (int i = 0; i < dp.length; i++) dp[i]= 1;
		
//		�ڿ����� 1�� ����
		for (int i = 0; i < dp.length; i++) {
			for (int j = i; j < dp.length; j++) {
				if(seq[i]>seq[j]) {
					dp[j]= dp[i]+1;
					if(dp[j]>nmax) nmax = dp[j];	
//					System.out.println("i:"+i+" j:"+j+" seq[i]:"+seq[i]+" seq[j]"+seq[j]+" dp: "+dp[j]);
				}
			}
		}
		System.out.println(nmax);
	}
}
