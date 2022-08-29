package sub3;

public class Car { // class는 교실과 그룹이라는 뜻이 있다.

	// 속성
	private String name; // 속성과 기능들을 맴버라고 한다.
	private String color;
	private int speed;
	public static int count;

	// 생성자
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++;
	}

	// Getter, Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

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
		System.out.println("현재차량수: " + count);
	}

}
