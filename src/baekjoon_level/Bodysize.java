package baekjoon_level;

import java.util.Scanner;

public class Bodysize {
	public void bodysize() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] weight = new int[n];
		int[] height = new int[n];
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			weight[i] = sc.nextInt();
			height[i] = sc.nextInt();
		}
		sc.close();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(weight[i]<weight[j]) {
					if(height[i]<height[j])num[i]++;
				}
			}
			System.out.print(num[i]+1+" ");
		}
	}
}
