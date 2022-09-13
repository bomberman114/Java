package sub3;

import java.util.ArrayList;
import java.util.List;

/*
* 날짜 : 2022/09/13
* 이름 : 조현길
* 내용 : 자료구조 List 실습하기
* 
*  List
*   - 배열과 유사하지만 동적으로 생성되는 선형 자료구조
*   - List를 구현한 ArrayList를 가장 많이 사용
* 
* 
*  
*/
public class ListTest {
	public static void main(String[] args) {

		// List 생성
		ArrayList<Integer> list = new ArrayList<>();

		// 데이터 입력
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(1, 6); // index번호 1번자리에 6을 넣고 나머지는 밀려서 저장된다.
		list.remove(2); // index번호 2번자리를 삭제시킨다.

		System.out.println(list);

		// 데이터 출력
		System.out.println("1번쨰 원소" + list.get(0));
		System.out.println("2번쨰 원소" + list.get(1));
		System.out.println("3번쨰 원소" + list.get(2));

		// List 크기
		System.out.println("list 크기 : " + list.size());

		// List 반복문
		for (int n : list) {
			System.out.print(n + " ");
		}
		System.out.println();

		// 문자열 리스트
		List<String> people = new ArrayList<>();

		people.add("김유신");
		people.add("김춘추");
		people.add("장보고");
		people.add("강감찬");
		people.add("이순신");

		System.out.println(people);

		// 객체 리스트
		List<Apple> apples = new ArrayList<>();

		// apples.add(new Apple("한국", 3000));
		Apple a1 = new Apple("한국", 3000);
		apples.add(a1);
		apples.add(new Apple("미국", 2000));
		apples.add(new Apple("일본", 1000));

		// 한국사과
		Apple apple = apples.get(0);
		apple.show();

		// 미국 사과
		apples.get(1).show();

		// 일본 사과
		apples.get(2).show();

	}
}
