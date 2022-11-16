//https://www.acmicpc.net/problem/2557

package baekjoon_level;



import java.util.Arrays;

//public class Main {
//	public static void main(String[] args) {
//		System.out.println("Hello World!");
//	}
//}
//import java.util.Scanner;
//public class Main{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a,b;
//		a = sc.nextInt();
//		b = sc.nextInt();
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.println(a/b);
//		System.out.println(a%b);
//	}
//}
//import java.util.Scanner;
//public class Main{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String s= sc.nextLine();
//		System.out.println(s+"??!");
//	}
//}

//import java.util.Scanner;
//public class Main{
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		int[] n = new int[6];
//		for (int i = 0; i < n.length; i++) {
//			n[i]=sc.nextInt();
//		}
//		int[] p= new int[6];
//		for (int i = 0; i < n.length; i++) {
//			if(0<=i&&i<2)	p[i]=1-n[i];
//			else if(1<i&&i<5) p[i]=2-n[i];
//			else p[i]=8-n[i];
//		}
//		for (int i = 0; i < n.length; i++) {
//			System.out.print(p[i]+" ");
//		}
//	}
//}

//import java.util.Scanner;
//public class Main{
//	public int main(){
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int sum=0;
//		int[] a= new int[n];
//		for (int i = 0; i < a.length; i++) {
//			a[i] =sc.nextInt();
//			sum= sum+ a[i];
//		}
//		return sum;
//	}
//}

//백준4673
//import java.util.Arrays;
//public class Main {
//	public static void main(String[] args) {
//    	int n=10000;
//    	int p=0;
//    	int[] s= new int[n];
//        for (int i = 1; i < n; i*=10) {
//        	for (int j = i; j <10*i; j++) {
//        		p=j%i;
//        		while(p>=10){
//        			s[j]=s[j]+p%10;
//        			p=(p/10);
//        		}
//    			s[j]=s[j]+j+(j/i)+p;
//			}
//		}
//        Arrays.sort(s);
//        for (int i = 1; i <= n; i++) {
//        	if(Arrays.binarySearch(s, i)>0)continue;
//        	System.out.println(i);
//		}
//    }
//}

//백준 1065
import java.util.Scanner;
public class main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
        int n = 111;
		int count =0;
        
		int[] jarisu = new int[4];
		for (int i = 1; i <= n; i*=10) {
            for(int j =i; j <= n; i++){
                if(j<100)count++;
                while(j%i>0) {
                	jarisu[i]=j%i; 
                	
                	}
                }
            }
			
		System.out.println(count);
	}
}

111 123 135 147 159
222 234 246 258 210
333 345 357 369 321
444 456 469 420 432
