package baekjoon_level;
import java.io.*;
import java.util.Arrays;
public class Baekjoon_1181 {
	public void baekjoon_1181() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine());
		String[] str = new String [N];
		for (int i = 0; i < N; i++) {
			str[i] = bf.readLine();
		}
		Arrays.sort(str);
		String[] sort = new String[N];
		int num=1;
		int cnt=0;
		while(cnt<N){
			for (int i = 0; i < N; i++) {
				if(str[i].length()==num){
					sort[cnt]=str[i];
					cnt++;
				}
			}
			num++;
		}
		for (int i = 0; i < N; i++) {
			if(i<N-1 && sort[i].equals(sort[i+1]))continue;
			bw.write(sort[i]+"\n");
		}
		
		bw.flush();
		bw.close();
	}
}
