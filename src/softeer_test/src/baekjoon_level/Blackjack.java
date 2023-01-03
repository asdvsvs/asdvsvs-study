package baekjoon_level;

import java.util.Scanner;

public class Blackjack {

	public void blackjack(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] num = new int [n];
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		
		int result=0;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				for (int k = j+1; k < n; k++) {
					if(num[i]+num[j]+num[k]<=m){
						result = Math.max(result, num[i]+num[j]+num[k]);	
					}						
				}
			}
		}
		System.out.println(result);
	}
}
