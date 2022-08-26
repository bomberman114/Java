package ch05;

/*
 * 날짜 : 2022/08/23
 * 이름 : 조현길
 * 내용: 참조 값 출력하기
 *   
 * 
 * 
 */
public class P150 {

	public static void main(String[] args) {
		P144 student1 = new P144();
		student1.studentName = "안연수";
		P144 student2 = new P144();
		student2.studentName = "안승연";
		System.out.println(student1);
		System.out.println(student2);

	}

}
