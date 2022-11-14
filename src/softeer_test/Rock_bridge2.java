package softeer_test;

import java.util.Scanner;

public class Rock_bridge2 {

	public void rock_bridge2() {
		
		int n;
		int count =1;
		int dcount = 1;
		System.out.print("돌의개수 입력:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int[] nheight = new int[n];
		System.out.print("돌의 높이 서쪽에서부터 입력:");
		for (int i = 0; i < nheight.length; i++) {
			nheight[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n-1; i++) {
			for (int j = i; j < n-1; j++) {
				
				if(nheight[i]<nheight[j+1]) {
					count++;
					i=j;
					System.out.println(nheight[i] + "up"+ nheight[j+1]);
					break;
					}
				}
			}
		for (int i = 0; i < n-1; i++) {
			for (int j = i; j < n-1; j++) {
				if(nheight[i]>nheight[j+1]) {
					dcount++;
					i=j;
					System.out.println(nheight[i] +"down"+ nheight[j+1]);
					break;
				}
			}
			
//			7 8 3 5 2 4 9 10 6 1
			
		}
		
		System.out.print("돌"+ count + dcount);
		
	}
}
