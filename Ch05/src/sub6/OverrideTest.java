package sub6;

/*
 * 날짜 : 2022/08/31
 * 이름 : 조현길
 * 내용 : 오버라이드 메서드 실습하기
 * 
 * 메서드 재정의(Override)
 *  - 부모클래스의 메서드를 자식클래스에서 재정의하는 문법
 *  - 오버라이드를 통해서 객체지향 프로그래밍의 다향성을 구현
 * 
 */

class AAA {
	public void method1() {
		System.out.println("AAA::method1..."); // 오버라이드 당함

	}

	public void method2() {
		System.out.println("BBB::method2...");

	}

	public void method3() {
		System.out.println("CCC::method3...");

	}

}

class BBB extends AAA {
	@Override
	public void method2() {
		System.out.println("BBB::method1...");

	}

	public void method3(int a) { // 매게변수로 구별해서 오버로드
		System.out.println("BBB::method1...");

	}
}

class CCC extends BBB {
	@Override
	public void method1() {
		System.out.println("CCC::method1..."); // 오버라이드 함, 오버라이드메서드

	}

	@Override
	public void method2() {
		System.out.println("CCC::method2...");

	}

	public void method3(int a, int b) { // 매게변수로 구별해서 오버로드
		System.out.println("CCC::method3...");

	}
}

public class OverrideTest {
	public static void main(String[] args) {

		// 오버라이드 메서드 실행
		CCC c = new CCC();
		c.method1();
		c.method2();
		c.method3();
		c.method3(1); // 매게변수로 구분함 오버로드
		c.method3(1, 2); // 매게변수로 구분함 오버로드

		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		Truck bongo = new Truck("봉고", "파란색", 0, 0);
		sonata.speedUp(100);
		sonata.speedTurbo();
		sonata.show();

		bongo.speedUp(100);
		bongo.show();
	}
}
