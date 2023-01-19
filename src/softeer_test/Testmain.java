
	
package softeer_test;

import java.io.*;
import java.awt.Checkbox;
import java.util.*;
//import java.net.http.HttpResponse.BodyHandler;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

//import baekjoon_level.NM_1;
import baekjoon_level.*;
import dp.*;
import dp.Climbing_stairs;
import dp.Decreasing_sequence;
import dp.Downhill;
import dp.Fibonacci2;
import dp.Make1;
import dp.Resign2;
import dp.Tile2xn;

public class Testmain {

	public static void main(String[] args) throws IOException {
		
		
//		평균점수
//		Score_avg scoreavg = new Score_avg();
//		scoreavg.score_avg();
		
//		징검다리
//		Rock_bridge rock = new Rock_bridge();
//		rock.rock_bridge();
		
//		슈퍼바이러스
//		Supervirus supervi = new Supervirus();
//		supervi.supervirus();
		
//		강의실배정 (못품)
//		Room_assign room = new Room_assign();
//		room.room_assign();
		
//		징검다리2
//		Rock_bridge2 rock2 = new Rock_bridge2();
//		rock2.rock_bridge2();
		
//		피보나치2
//		Fibonacci2 fibo = new Fibonacci2();
//		fibo.fibonacci();
		
//		1로만들기, https://st-lab.tistory.com/133
//		Make1 make = new Make1();
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		System.out.println(make.make1(n,0));
		
//		계단오르기
//		Climbing_stairs climb = new Climbing_stairs();
//		climb.climbing_stairs();
		
//		2xn 타일링
//		Tile2xn tile = new Tile2xn();
//		tile.tile2xn();
		
//		가장 긴 감소하는 부분 수열
//		Decreasing_sequence decresing = new Decreasing_sequence();
//		decresing.decreeasing();
		
//		퇴사2, 내가 못품
//		Resign2 resign2 = new Resign2();
//		resign2.resign2();
		
//		내리막길
//		Downhill downhill= new Downhill();
//		downhill.downhill();
		

//		인접 행렬, 소프티어 모의테스트
//		Procession_size pro = new Procession_size();
//		pro.procession_size();
		

//		한수
//		Hansu t = new Hansu();
//		t.hansu();
		
//		팩토리얼, 10872번 재귀
//		Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.close();
//		Factorial fac = new Factorial();
//		System.out.println(fac.factorial(n));

//		블랙잭, 2798번
//		Blackjack black = new Blackjack();
//		black.blackjack();
		
//		분해합 2231번
//		Decomposition decom = new Decomposition();
//		decom.decomposition();
		
//		덩치 7568번
//		Bodysize body = new Bodysize();
//		body.bodysize();
		
//		체스판 다시 칠하기 1018번
//		Chess_repaint chess = new Chess_repaint();
//		chess.chess_repaint();
		
//		영화감독 숌 1436번
//		Moviedirector_soum movie = new Moviedirector_soum();
//		movie.moviedirector_soum();
		
//		흑백이미지 압축 소프티어코테 문제
//		Blackwhite bw = new Blackwhite();
//		bw.blackwhite();
		
//		칠하기 놀이 소프티어코테 문제
//		Paint p = new Paint();
//		p.paint();
		
//		구간 합 구하기4, 11659번
//		Space_sum spacesum = new Space_sum();
//		spacesum.space_sum();
		
//		N과 M(1) 15649번
//		NM_1 nm1 = new NM_1();
//		nm1.nm_1();
		
//		손익분기점 1712번
//		Breakeven_point breakpoint = new Breakeven_point();
//		breakpoint.breakeven_point();
		
//		벌집 2292번
//		Honeycomb honeycomb = new Honeycomb();
//		honeycomb.honeycomb();
		
//		분수찾기 1193번 
//		Fraction_find fraction = new Fraction_find();
//		fraction.fraction_find();
		
//		달팽이는 올라가고싶다 2869번
//		Baekjoon_2869 baek2869 = new Baekjoon_2869();
//		baek2869.baekjoon_2869();
		
//		ACM호텔 10250번
//		Baekjoon_10250 baek10250 = new Baekjoon_10250();
//		baek10250.beaekjoon_10250();
		
//		부녀회장이 될테야 2775번, 테스트 케이스 여러개일때는 배열에 값저장 후 이용하면 더 빠름(재귀로 안푸는방법)
//		Baekjoon_2775 baek2775 = new Baekjoon_2775();
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		int t = Integer.parseInt(bf.readLine());
//		for (int i = 0; i < t; i++) {
//			int k = Integer.parseInt(bf.readLine());
//			int n = Integer.parseInt(bf.readLine());
//			System.out.println(baek2775.baekjoon_2775(k,n));
//		}
		
//		설탕배달 2839번
//		Baekjoon_2839 baek2839 = new Baekjoon_2839();
//		baek2839.baekjoon_2839();
		
//		큰 수 A+B 10757번
//		Baekjoon_10757 baek10757 = new Baekjoon_10757();
//		baek10757.baekjoon_10757();
		
//		행렬 덧셈 2738번
//		Baekjoon_2738 baek2738 = new Baekjoon_2738();
//		baek2738.baekjoon_2738();
		
//		최댓값 2566번
//		Baekjoon_2566 baek2566 = new Baekjoon_2566();
//		baek2566.baekjoon_2556();
		
//		색종이 2563번
//		Baekjoon_2563 baek2563 = new Baekjoon_2563();
//		baek2563.baekjoon_2563();
		
//		수 정렬하기 2750번
//		Baekjoon_2750 baek2750 = new Baekjoon_2750();
//		baek2750.baekjoon_2759();
		
//		대표값 2587번
//		Baekjoon_2587 baek2587 = new Baekjoon_2587();
//		baek2587.baekjoon_2587();
		
//		커트라인 25305번
//		Baekjoon_25305 baek25305 = new Baekjoon_25305();
//		baek25305.baekjoon_25305();
		
//		수 정렬하기2 2751번
//		Baekjoon_2751 baek2751 = new Baekjoon_2751();
//		baek2751.baekjoon_2751();
		
//		수 정렬하기3 10989번
//		Baekjoon_10989 baek10989 = new Baekjoon_10989();
//		baek10989.baekjoon_10989();
		
//		통계학 2108번
//		Baekjoon_2108 baek2108 = new Baekjoon_2108();
//		baek2108.baekjoon_2108();
		
//		소트인사이드 1427번
//		Baekjoon_1427 baek1427 = new Baekjoon_1427();
//		baek1427.baekjoon_1427();
		
//		좌표 정렬하기 11650번
//		Baekjoon_11650 baek11650 = new Baekjoon_11650();
//		baek11650.baekjoon_11650();

//		좌표정렬하기2 11651번
//		Baekjoon_11651 baek11651 = new Baekjoon_11651();
//		baek11651.baekjoon_11651();
		
//		단어 정렬 1181번
		Baekjoon_1181 baek1181 = new Baekjoon_1181();
		baek1181.baekjoon_1181();
	}
}
