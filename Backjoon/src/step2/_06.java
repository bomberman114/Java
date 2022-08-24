package step2;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 조현길
 * 내용: 백준 2단계 6번 문제. 오븐시계
 *                           
 */
public class _06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int A = in.nextInt();
		int B = in.nextInt();

		int C = in.nextInt();

		int min = 60 * A + B; // 시 -> 분
		min += C;

		int hour = (min / 60) % 24;
		int minute = min % 60;

		System.out.println(hour + " " + minute);

	}
}
