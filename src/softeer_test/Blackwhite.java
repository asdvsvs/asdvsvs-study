package softeer_test;

import java.util.Scanner;

public class Blackwhite {
	public void blackwhite() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] nb = new int[n][n];
		boolean[][] bool = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				nb[i][j] = sc.nextInt();
				if(nb[i][j]>0)bool[i][j]=true;
				else bool[i][j]=false;
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				
				if(bool[i][j]==false) {
					if(bool[i][j+1]==false&& bool[i+1][j]==false&&bool[i+1][j+1]==false) {
						continue;
					}
					System.out.print("(0");
					}
				
				else if(bool[i][j]==true) {
					if(bool[i][j+1]==true&& bool[i+1][j]==true&&bool[i+1][j+1]==true) {
						System.out.print("1");
						
					}
				}
				
			}
		}
	}
}
