package sub1;

/*
 * 날짜 : 2022/09/07
 * 이름 : 조현길
 * 내용 : 수행평가 별찍기4
 * 
 * 
 * 
 */
public class Star4 {

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 8; j++) {
				if (j < 4 - i || i + 5 < j + 1) {
					System.out.print("☆");
				} else {
					System.out.print("★");
				}
			}
			System.out.println("");
		}
	}
}
