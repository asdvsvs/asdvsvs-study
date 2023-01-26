package baekjoon_level;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_10814 {
	public void baekjoon10814() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(bf.readLine());
		int [] man_age = new int [N];
		String [] man_name = new String [N];
		int [] age = new int[N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine());
			man_age[i] = Integer.parseInt(st.nextToken());
			man_name[i] = st.nextToken();
			age[i] = man_age[i];
		}
		Arrays.sort(age);
		String[] name = new String[N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(age[i]==man_age[j]){
					name[i]=man_name[j];
					man_age[j]=0;
					break;
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			bw.write(age[i]+ " "+name[i]+"\n");
		}
		bw.flush();
		bw.close();
	}
}
