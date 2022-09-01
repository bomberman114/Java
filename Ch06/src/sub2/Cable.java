package sub2;

public class Cable implements Socket {

	private Bulb bulb;

	public Cable(Bulb bulb) {
		this.bulb = bulb;

	}

	@Override
	public void switchOn() {
		// TODO Auto-generated method stub
		bulb.lightOn();
	}

	@Override
	public void switchOff() {
		// TODO Auto-generated method stub
		bulb.lightOff();

	}

}
