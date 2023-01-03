package baekjoon_level;


import java.util.*;
import java.util.Scanner;

public class Moviedirector_soum {
	public void moviedirector_soum() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int[] e1 = new int [1000];
		int[] e2 = new int [1000];
		int[] e3 = new int [1000];
		int[] e4 = new int [1000];
		int six3 = 666;
		e1[0] = six3;
		for (int i = 1; i < 1000; i*=10) {
			for (int j = i-1; j < i*10; j++) {
				e1[j]=(six3*10+j/i)*i+j%i;
				e2[j]=six3*100+j;
				e3[j]=j*1000+six3;
				e4[j]=(j/i)*1000*i+six3*i+j%i;
			}
		}
		System.out.println(Arrays.toString(e1));
		System.out.println(Arrays.toString(e2));
		System.out.println(Arrays.toString(e3));
		System.out.println(Arrays.toString(e4));
		
		int[] newe = new int[4000];
		System.arraycopy(e1, 0, newe, 0, e1.length);
		System.arraycopy(e2, 0, newe, e1.length, e2.length);
		System.arraycopy(e3, 0, newe, e2.length, e3.length);
		System.arraycopy(e4, 0, newe, e3.length, e4.length);

//		Arrays.sort(newe);
		int ze=0;
		for (int i = 3999; i > 1; i--) {
			if(newe[i]==0)ze++;
			else break;
		}
		int[] newe2 = new int[4000-ze];
		System.out.println(ze);
		System.arraycopy(newe, 0, newe2, 0, 4000-ze);

		System.out.println(Arrays.toString(newe));
		Arrays.sort(newe2);
		System.out.println(Arrays.toString(newe2));
		

	}
}
