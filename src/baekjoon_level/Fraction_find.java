package baekjoon_level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fraction_find {
	public void fraction_find() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(bf.readLine());
		int n[][]=new int[x][x];
		int cnt=1;
		
		int a=0,b=0;
		
		loopOut:
		while(cnt<=x){
			
			int ta=a,tb=b;
			if(a==0&&b==0){
				n[a][b]=cnt++;
				b++;
			}
			if(a<b){
				while(a<=tb){
					if(cnt==x){
						System.out.println((a+1)+"/"+(b+1));
						break loopOut;
					}
					n[a][b]=cnt++;
					if(a==tb)break;
					a++;
					b--;
				}
			}
			else if(a>b){
				while(b<=ta){
					if(cnt==x){
						System.out.println((a+1)+"/"+(b+1));
						break loopOut;
					}
					n[a][b]=cnt++;
					if(b==ta)break;
					a--;
					b++;
				}
			}
		}
		
		
	}
}
