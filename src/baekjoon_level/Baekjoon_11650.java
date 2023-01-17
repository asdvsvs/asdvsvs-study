package baekjoon_level;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_11650 {
	public void  baekjoon_11650() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(bf.readLine());
		int[] x = new int[N];
		int[] y = new int[N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		int[] sortx = new int[N];
		int[] sorty = new int[N];
		for (int i = 0; i < N; i++) sortx[i]=x[i];
		Arrays.sort(sortx);
		
		for (int i = 0; i < N; i++) {
			int cnt=1;
			int arrcnt=0;
			int[] arr= new int[N];
			for (int j = i+1; j < N; j++){
				if(sortx[i]==sortx[j])cnt++;
				arr[arrcnt]=j;
				arrcnt++;
			}

			if(cnt>1){
				int[] temp = new int[cnt];
				for (int k = 0; k < cnt; k++)temp[k]=y[arr[k]];
				Arrays.sort(temp);
				for (int k = 0; k < cnt; k++)sorty[i+k]=temp[k];
				i+=cnt-1;
			}
			else {
				for (int j = 0; j < N; j++) {
					if(sortx[i]==x[j]){
						sorty[i]=y[j];
						break;
					}
				}
			}	
		}		
		for (int i = 0; i < N; i++) {
			bw.write(String.valueOf(sortx[i])+" "+String.valueOf(sorty[i]));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
