package baekjoon_level;


public class Factorial {
	public int factorial(int n){
		if(n==0) return 1;
		return n*factorial(n-1);
	}
}

//제출한 답안

//import java.util.Scanner;
//
//public class Main
//{
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.print(Factorial(n));
//    }
//
//    public static int Factorial(int n){
//		if(n==0) return 1;
//		return n*Factorial(n-1);
//	}
//}