package baekjoon_level;

import java.util.Scanner;

public class Space_sum {

	public void space_sum() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] nn = new int[n+1];
		for (int i = 1; i <= n; i++) {
			nn[i] = nn[i-1]+sc.nextInt();
		}
		StringBuilder sBuilder = new StringBuilder();
		for (int i = 0; i < m; i++) {
			int s= sc.nextInt();
			int l= sc.nextInt();
			sBuilder.append(nn[l]-nn[s-1]+" ");
//			System.out.println(nn[l] -nn[s-1]);
		}
		System.out.println(sBuilder.toString());
		sc.close();
	}
}
