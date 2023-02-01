package baekjoon_level;
import java.io.*;
import java.util.*;

public class Baekjoon_18870 {
	public void baekjoon_18870 () throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		ArrayList<Integer> arr = new ArrayList<>();
		
		int N = Integer.parseInt(bf.readLine());
		int[] num = new int [N];
		int[] nsort = new int [N];
		int[] snum = new int [N];
		st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(st.nextToken());
			arr.add(num[i]);
			nsort[i]=num[i];
		}
		Arrays.sort(nsort);
		for (int i = 1; i < N; i++) {
			snum[i]=snum[i-1];
			if(nsort[i-1]<nsort[i])snum[i]++;
		}
		for (int i = 0; i < N; i++) {
			Collections.replaceAll(arr, nsort[i], snum[i]);
		}
		for (int i = 0; i < N; i++) {
			bw.write(String.valueOf(arr.get(i))+" ");
		}
		
		bw.flush();
		bw.close();
	}
	
	public ArrayList<Integer> search(int narr[],int n){
		ArrayList<Integer> newarr= new ArrayList<>();
		if(narr[narr.length/2]>n){
			for (int i = 0; i < narr.length/2; i++) {
				newarr.add(narr[i]);
			}
			return newarr;
		}
	}
}
