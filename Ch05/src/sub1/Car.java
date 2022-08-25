package sub1;

public class Car { // class는 교실과 그룹이라는 뜻이 있다.

	// 속성
	 String name; // 속성과 기능들을 맴버라고 한다.
	 String color;
	int speed;

	// 기능
	public void speedUp(int speed) {
		this.speed += speed;

	}

	public void speedDwon(int speed) {
		this.speed -= speed;

	}

	public void show() {
		System.out.println("차량명: " + name);
		System.out.println("차량색: " + color);
		System.out.println("현재속도: " + speed);
	}

}
