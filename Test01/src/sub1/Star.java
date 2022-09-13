package sub1;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/07
 * 이름 : 조현길
 * 내용 : 수행평가 별찍기1
 * 
 * 
 * 
 */
public class Star {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		in.close();

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}