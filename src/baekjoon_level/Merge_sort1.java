package baekjoon_level;

public class Merge_sort1 {
	public void merge_sort1(int[] A, int p, int r){
		if(A[0]<A[A.length-1]){
			int q = (p+r)/2;
			merge_sort1(A,p,q);
			merge_sort1(A,q+1,r);
			merge(A, p, q, r);
		}
	}
	
	public void merge(int A[], int p, int q, int r){
		int i = p;
		int j = q+1;
		int t = 1;
		int[] tmp= new int[A.length];
		while(i<= q && j<= r){
			if(A[i] <= A[j])
				tmp[t++] = A[i++];
			else
				tmp[t++] = A[j++];
		}
		while(i<= q)
			tmp[t++] =A[i++];
		while(j<= r)
			tmp[t++] =A[i++];
		i = p;
		t = 1;
		while(i<= r)
			A[i++] = tmp[t++];
	}
	

}
