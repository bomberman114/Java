package sub4;

/*
 * 날짜 : 2022/08/18
 * 이름 : 조현길
 * 내용: Java 반복문 while 실습하기
 * 
 * 
 * 
 * 
 */
public class WhileTest {

	public static void main(String[] args) {

		// 1부터 10까지의합
		int sum = 0;
		int k = 1;
		while (k <= 10) {

			sum += k;
			k++;
		}

		System.out.println("1부터 10까지 합:" + sum);
		// do ~ while
		// 섬세한 제어에 쓰인다.
		// 일단 실행을 하고 조건을 나중에 따지기 때문에 위험할 수 도있다.
		int tot = 0;
		int i = 1;
		do {
			if (i % 2 == 0) {
				tot += i;
			}

			i++;
		} while (i <= 10);
		System.out.println("1부터 10까지 짝수합:" + tot);

		// break
		int num = 1;
		while (true) { // true를쓰면 무한루프가 된다.

			if (num % 5 == 0 && num % 7 == 0) {
				break; // 반목문 종료
			}
			num++;
		}
		System.out.println("5와 7의 최소공배수:" + num); // 루프를 시켜서 특정조건으로 먼가를 찾을떄 유요할거 같다.
		// continue
		int total = 0;
		int j = 1;
		while (j <= 10) {
			j++;  //여기서 시작되는거라고 바도 될거같다.
			// 홀수합으로 수정 2022-08-18 조현길
			if (j % 2 == 0) {

				continue; // 반복문의 처음으로 보낸다.

			}
			total += j;

		}
		System.out.println("1부타 10까지의 홀수합:" + total);

	}

}
