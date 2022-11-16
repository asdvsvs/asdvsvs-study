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

//น้มุ4673
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
    	int n=10000;
    	int p=0;
    	int[] s= new int[n];
        for (int i = 1; i < n; i*=10) {
        	for (int j = i; j <10*i; j++) {
        		p=j%i;
        		while(p>10){
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
