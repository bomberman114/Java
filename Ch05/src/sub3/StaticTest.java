package sub3;
/*
 * 날짜 : 2022/08/29
 * 이름 : 조현길
 * 내용 : 클래스 변수, 클래스 메서드 실습하기
 *  
 *    클래스 변수, 클래스 메서드(Static 변수, 메서드)
 *     - static을 선언한 변수, 메서드로 Java Class Area에 생성
 *     - 별도의 객체 생성(new) 하지 않고 해당 클래스 탕비으로 참조, 실행
 *     - 객체(인스턴스)들간의 공유에 목적으로 클래스 변수, 클래스 메소드 사용
 *     
 *     싱글콘 객체(Singleton)
 *      - 싱글톤 패턴이 적용된 객체는 하나의 인스턴트로 존재
 *      - 싱글톤 객체를 사용해서 메모리 절약과 성능 향상을 기대
 * 
 * 
 */

class Increment {
	private int num1;
	private static int num2; // static을 붙였기때문에 모든 num2는 공유가 된다.

	public Increment() {
		num1++;
		num2++;
		System.out.println("num1 : " + num1);
	}

	public static void show() {
		System.out.println("num2 : " + num2);
	}
}

public class StaticTest {

	public static void main(String[] args) { // static이 선언되있는 메인이기 때문에 가장 먼저 실행되고
		// 클래스 변수 실습 //가장 나중에 삭제 된다.
		Increment inc1 = new Increment();
		Increment.show();

		Increment inc2 = new Increment();
		Increment.show();

		Increment inc3 = new Increment();
		Increment.show();
		Car sonata = new Car("소나타", "흰색", 0);
		Car avante = new Car("아반테", "은색", 0);
		sonata.show();
		avante.show();
		System.out.println("전체 차량수 : " + Car.count);
		// 싱글톤(Singleton) 객체 실습
		Calc c1 = Calc.getInstance();
		Calc c2 = Calc.getInstance();
		int r1 = c1.plus(1, 2);
		int r2 = c2.plus(2, 3);
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
	}

}
