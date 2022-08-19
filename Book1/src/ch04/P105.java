package ch04;

/*
 * 날짜 : 2022/08/17
 * 이름 : 조현길
 * 내용: switch-case문 예제(2)
 *   
 * 
 * 
 */
public class P105 {

	public static void main(String[] args) {
		String medal = "Gold";
		switch (medal) {
		case "Gold":
			System.out.println("금메달 입니다.");
			break;
		case "Silver":
			System.out.println("은메달 입니다.");
			break;
		case "Bronze":
			System.out.println("동메달 입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		}
	}

}
