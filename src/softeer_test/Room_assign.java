package softeer_test;

import java.util.Scanner;


public class Room_assign {

	public void room_assign(){
		
		int n;
		int count=1;
		
		
		System.out.print("���� ���� :");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int[] s = new int[n];
		int[] f = new int[n];
		
		
		for (int i = 0; i < n; i++) {
			System.out.print(i+1+"��° ���۽ð�, ����ð� �Է�:");
			s[i] = sc.nextInt();
			f[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(f[i]<=s[j+1]) count++;
				else j++;
			}
		}
	}
}
