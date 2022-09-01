package sub1;

public class Sedan extends Car {

	public Sedan(String name, String color, int speed) {
		super(name, color, speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speedUp(int speed) {
		// TODO Auto-generated method stub
		this.speed += speed;
	}

	@Override
	public void speedDown(int speed) {
		// TODO Auto-generated method stub
		this.speed -= speed;
	}

}
