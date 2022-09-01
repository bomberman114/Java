package sub1;

public abstract class Car {

	protected String name;
	protected String color;
	protected int speed;

	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}

	public abstract void speedUp(int speed);

	public abstract void speedDown(int speed);

	public void show() {
		System.out.println(" 챠량명 : " + name);
		System.out.println(" 챠량색 : " + color);
		System.out.println(" 챠량속도 : " + speed);
	}
}
