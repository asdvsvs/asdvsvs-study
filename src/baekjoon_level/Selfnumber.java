//백준4673, 셀프넘버

package baekjoon_level;

import java.util.Arrays;

public class Selfnumber {
	public void selfnumber(){
		int n=10000;
	  	int p=0;
	  	int[] s= new int[n];
	      for (int i = 1; i < n; i*=10) {
	      	for (int j = i; j <10*i; j++) {
	      		p=j%i;
	      		while(p>=10){
	      			s[j]=s[j]+p%10;
	      			p=(p/10);
	      		}
	  			s[j]=s[j]+j+(j/i)+p;
				}
			}
	      Arrays.sort(s);
	      for (int i = 1; i <= n; i++) {
	      	if(Arrays.binarySearch(s, i)>0)continue;
	      	System.out.println(i);
			}
	}
	
}