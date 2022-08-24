package step01;
/*
 * 날짜 : 2022/08/19
 * 이름 : 조현길
 * 내용: 백준 1단계 12번 문제. 곱셈
 *                           
 */

import java.util.Scanner;

public class _12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a * b;
		for (int i = 0; i <= (int) (Math.log10(b) + 1); i++) {
			int d = b % 10;
			b /= 10;
			System.out.println(d * a);
		}
		System.out.println(b * a);
		System.out.println(c);
		sc.close();
	}

}
