package baekjoon_level;

import java.util.Scanner;

public class Chess_repaint {
	public void chess_repaint() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int result=64;
		int min;
		
		String[] nmsc = new String [n];
		String[] nm = new String[n];
		for (int i = 0; i < n; i++)nmsc[i] = sc.next();
		char[] e;
		sc.close();
	
		for (int nr = 0; nr <= n-8; nr++) {
			for (int mr = 0; mr <= m-8; mr++) {
					for (int i = 0; i < n; i++)nm[i]=nmsc[i];
					int count=0;
					
					for (int i = nr; i < nr+8; i++) {						
						for (int j = mr; j < mr+7; j++) {
							if(nm[i].charAt(j)=='W'&& nm[i].charAt(j+1)=='W') {
								e = nm[i].toCharArray();
								e[j+1]='B';
								nm[i] = String.valueOf(e);
								count++;
							}
							else if (nm[i].charAt(j)=='B'&& nm[i].charAt(j+1)=='B') {
								e = nm[i].toCharArray();
								e[j+1]='W';
								nm[i] = String.valueOf(e);
								count++;
							}
						}
						if(i<nr+7) {
							if(nm[i].charAt(mr)=='W'&& nm[i+1].charAt(mr)=='W') {
								e = nm[i+1].toCharArray();
								e[mr]='B';
								nm[i+1] = String.valueOf(e);
								count++;
							}
							else if(nm[i].charAt(mr)=='B'&& nm[i+1].charAt(mr)=='B') {
								e = nm[i+1].toCharArray();
								e[mr]='W';
								nm[i+1] = String.valueOf(e);
//								System.out.println(nr+","+mr+","+i+","+": b->w ½ºÀ§Äª ");
								count++;
							}
						}
					}
//					System.out.println("nr,mr,k,count: "+nr+","+mr+","+","+count);
//					for (int i = 0; i < n; i++)System.out.println(nm[i]);
					min = Math.min(count, 64-count);
					result = Math.min(result, min);
//				System.out.println(nr+","+mr+"°ª"+result);
			}
		}
//		for (int i = 0; i < n; i++)System.out.println(nm[i]);
		System.out.println(result);
	}
}