package step2;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 조현길
 * 내용: 백준 2단계 2번 문제.시험 성적
 *                           
 */
public class _02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int A = in.nextInt();
		in.close();

		if (A >= 90)
			System.out.println("A");
		else if (A >= 80)
			System.out.println("B");
		else if (A >= 70)
			System.out.println("C");
		else if (A >= 60)
			System.out.println("D");
		else
			System.out.println("F");
	}

}
