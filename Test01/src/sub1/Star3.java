package sub1;

/*
 * 날짜 : 2022/09/07
 * 이름 : 조현길
 * 내용 : 수행평가 별찍기3
 * 
 * 
 * 
 */
public class Star3 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print("☆");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
}
