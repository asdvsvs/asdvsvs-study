package softeer_test;

import java.util.Scanner;

public class Rock_bridge {

	public void rock_bridge(){
		int rocknum;
		int count=1;
		
		System.out.print("���� ���� �Է�:");
		Scanner sc = new Scanner(System.in);
		rocknum = sc.nextInt();
		
		int[] rockh = new int[rocknum];
		System.out.print("���� ���� �Է�(���ʿ��� ���ʼ�����): ");
		
		for (int i = 0; i < rocknum; i++) {
			rockh[i] = sc.nextInt();			
		}
		for (int i = 0; i < rocknum-1; i++) {
			if(rockh[i]<rockh[i+1]) count++;
		}
		System.out.println(count);
	}
}
