//백준 25501번
package baekjoon_level;

public class Palindrome {

	public void palindrome(){
		for (int i = 0; i < 5; i++) {
			
		}
	}
}

//제출 답안
//import java.util.*;
//
//public class Main
//{
//    static int k;
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        String[] str = new String[t];
//        for(int i=0; i<t;i++){
//            str[i] = sc.next();
//        }
//        for(int i=0; i<t;i++){
//            k=0;
//            System.out.println(isPalindrome(str[i])+" "+k);
//        }
//    }
//    public static int recursion(String s, int l, int r){
//        k++;
//        if(l >= r) return 1;
//        else if(s.charAt(l) != s.charAt(r)) return 0;
//        else return recursion(s, l+1, r-1);
//    }
//    public static int isPalindrome(String s){
//        return recursion(s, 0, s.length()-1);
//    }
//    
//}