//package baekjoon_level;
//
//import java.util.*;
//import java.io.*;
//
//public class Main
//{
//    static int count;
//    static int k;
//    static int result=-1;
//	static int[] tmp;
//    public static void main(String[] args) throws IOException
//    {
//    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    	StringTokenizer st = new StringTokenizer(br.readLine());    
//
//    	int N = Integer.parseInt(st.nextToken());
//        k = Integer.parseInt(st.nextToken());
//
//        st = new StringTokenizer(br.readLine());
//        int[] A = new int[N+1];
//        for(int i=0;i<N;i++){
//            A[i]=Integer.parseInt(st.nextToken());
//        }
//        merge_sort1(A,0,N-1);
//        System.out.println(result);
//    }
//    
//   public static void merge_sort1(int[] A, int p, int r){
//	   if(count>k) return;
//	   if(p<r){
//			int q = (p+r)/2;
//			merge_sort1(A,p,q);
//			merge_sort1(A,q+1,r);
//			merge(A, p, q, r);
//		}
//	}
//	
//	public static void merge(int A[], int p, int q, int r){
//		int i = p;
//		int j = q+1;
//		int t = 1;
//		tmp=new int[A.length];
//		while(i<= q && j<= r){
//			if(A[i] <= A[j]) tmp[t++] = A[i++];
//			else tmp[t++] = A[j++];
//		}
//		while(i<= q) tmp[t++] =A[i++];
//		while(j<= r) tmp[t++] =A[j++];
//		i = p;
//		t = 1;
//		while(i<= r){
//			count++;
//            if(count==k) {
//            	result=tmp[t];
//            	break;
//            }
//			A[i++] = tmp[t++];
//		}
//	}
//    
//}
