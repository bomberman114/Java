package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 조현길
 * 내용: 백준 1단계 7번 문제. 사칙연산
 * 
 */
public class _07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int total1 = a + b;
		int total2 = a - b;
		int total3 = a * b;
		int total4 = a / b;
		int total5 = a % b;
		System.out.println(total1);
		System.out.println(total2);
		System.out.println(total3);
		System.out.println(total4);
		System.out.println(total5);
	}
}
