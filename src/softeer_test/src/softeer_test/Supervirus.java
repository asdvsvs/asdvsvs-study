package softeer_test;

import java.util.Scanner;

public class Supervirus {
	
	public void supervirus(){
		
		int k;
		int p;
		int n;
		int virus=1;
		
		System.out.println("바이러스의 수(K), 증가율(P), 총 시간(초)(N) 입력:");
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		p = sc.nextInt();
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			if (i==0) virus = k * p;
			else virus = virus*p;
		}
		
		System.out.println(virus/1000000007);
	}
}
