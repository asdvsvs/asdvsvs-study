package softeer_test;

import java.util.Scanner;

public class Paint {
	public void paint() {
		Scanner sc = new Scanner(System.in);
		int round = sc.nextInt();
		int shapen = sc.nextInt();
		int [] bool = new int[round*shapen];
		for (int i = 0; i < round ; i++) {
			for (int j = 0; j < shapen; j++) {
				bool[j] = sc.nextInt();
			}
		}	
		int rs= round*shapen;
		int n=1;
		for (int i = rs-1; i > 0; i-=n) {
			if(bool[i]==0) {
				String binary = Integer.toBinaryString((i*2)+1);
				System.out.println(binary);
				bool[i]=1;
			}
			if(bool[i]==1&&bool[i-1]==1) {
				n=n*2;
				if(n==2&&bool[i]==1)n=n*2;
			}
			
		}
	}
}
