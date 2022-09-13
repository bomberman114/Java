package sub1;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/07
 * 이름 : 조현길
 * 내용 : 수행평가 별찍기2
 * 
 * 
 * 
 */
public class Star2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		in.close();

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}