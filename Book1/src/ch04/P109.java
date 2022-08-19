package ch04;

/*
 * 날짜 : 2022/08/17
 * 이름 : 조현길
 * 내용: while문 활용하여 1부터10까지 더하기
 *   
 * 
 * 
 */
public class P109 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		while (num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}

}
