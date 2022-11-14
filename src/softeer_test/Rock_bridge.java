package softeer_test;

import java.util.Scanner;

public class Rock_bridge {

	public void rock_bridge(){
		int rocknum;
		int count=1;
		
		System.out.print("돌의 개수 입력:");
		Scanner sc = new Scanner(System.in);
		rocknum = sc.nextInt();
		
		int[] rockh = new int[rocknum];
		System.out.print("돌의 높이 입력(서쪽에서 동쪽순서로): ");
		
		for (int i = 0; i < rocknum; i++) {
			rockh[i] = sc.nextInt();			
		}
		for (int i = 0; i < rocknum-1; i++) {
			if(rockh[i]<rockh[i+1]) count++;
		}
		System.out.println(count);
	}
}
