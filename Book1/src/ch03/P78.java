package ch03;
/*
 * 날짜 : 2022/08/17
 * 이름 : 조현길
 * 내용: 단락 회로 평가 실습하기
 * 
 * 
 * 
 */
public class P78 {

	public static void main(String[] args) {
		int num1 =10;
		int i =2;
		boolean value = ((num1= num1 +10)<10)&&((i=i+2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1= num1 +10)<10)||((i=i+2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}

}
