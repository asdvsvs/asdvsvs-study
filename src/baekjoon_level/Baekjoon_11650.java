package baekjoon_level;
import java.io.*;
import java.util.*;

public class Baekjoon_11650 {
	public void  baekjoon_11650() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(bf.readLine());
		int[][] xy = new int[N][2];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine());
			xy[i][0] = Integer.parseInt(st.nextToken());
			xy[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(xy, (xy1, xy2) ->{
			if(xy1[0] == xy2[0]){
				return xy1[1] - xy2[1];
				}
			else {
				return xy1[0] - xy2[0];
			}
		});
		for (int i = 0; i < N; i++) {
			bw.write(xy[i][0] + " "+xy[i][1]+"\n");
		}
		
		bw.flush();
		bw.close();
	}
}
