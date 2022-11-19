//백준 1065번,한수

package baekjoon_level;

import java.util.Scanner;
public class Hansu{
	public void hansu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력:");
		int n = sc.nextInt();
		sc.close();
		int count =0;
        
		int[] jarisu = new int[4];
		for (int i = 1; i <= n; i*=10) {
            for(int j =i; j < 10*i; j++){
            	if(j>n)break;
                if(j<100) count++;
                else {
                    int jari=0;
                	int s=i;
                	int p=j;
                	while(p/s>0) {
                    	jarisu[jari]=p/s;
                    	p=j%s;
                    	s=s/10;
                    	jari++;
                    	if(p==0){
                    		jarisu[jari]=p;
                    		break;
                    		}
                    	}
					if(jarisu[0]+jarisu[2]==2*jarisu[1])count++;
                	}
                }
            }
		System.out.println(count);
	}
}

//111 123 135 147 159
//222 234 246 258 210
//333 345 357 369 321
//444 456 469 420 432