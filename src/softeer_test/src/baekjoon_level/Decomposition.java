package baekjoon_level;

import java.util.Scanner;

public class Decomposition {

	public void decomposition(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tp;
		int result=0;
		int count=1;
		
		int[] p= new int[7];
		
		loopout:
		for (int i = 1; i < 1000000; i*=10) {
			if(0<n/i&&n/i<10) {
				for (int j = n-(9*count); j < n; j++) {
					int sum=j;
					int jari=0;
					tp=j;
					for (int k = i; k >= 1; k/=10) {
						p[jari]=tp/k;
						tp=j%k;
						sum= sum+p[jari];
						}
					if(n==sum) {
						result = j;
						break loopout;
						}
					}
				}
			count++;
			}
		System.out.println(result);
	}
}
