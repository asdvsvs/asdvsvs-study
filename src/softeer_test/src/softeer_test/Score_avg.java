package softeer_test;

import java.util.Scanner;

public class Score_avg {

	public void score_avg() {
		
		int studentcount;
		int spacecount;
		int count;
		float sum;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�л� ��, ���� �� �Է� :");
		studentcount = sc.nextInt();
		spacecount = sc.nextInt();
		
		int score[] = new int[studentcount];
		int space_s[] = new int[spacecount];
		int space_e[] = new int[spacecount];
		
		System.out.print("�л� ���� �Է� :");
		for (int i = 0; i < studentcount; i++) {
			score[i] = sc.nextInt();
		}
		for(int i=0; i<spacecount; i++) {
			System.out.print(i+1 + "��° ���� �Է� :");
				space_s[i] = sc.nextInt()-1;
				space_e[i] = sc.nextInt()-1;		
		}
		for(int i = 0; i < spacecount; i++) {
			sum=0;
			count=0;
				for (int j = space_s[i]; j <= space_e[i]; j++) {
					sum= sum + score[j];
					count++;
				}
				System.out.printf("%.2f\n", sum/count);
			}
		}
}