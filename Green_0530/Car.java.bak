public class Car {
	private int speed;
	private int gear;
	private String color;
	
	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
	}
	
	public Car(String c) {
		this(c, 0, 1);
		System.out.println("초기화 과정 중~~");
	}

	// 접근(색상)
	public String getColor() {
		return color;
	}

	// 설정(색상)
	public boolean setColor(String c) {
		if (c != null) {
			color = c;
			return true;
		}
		return false;
	}
	// setter <<
	public void setSpeed(int s) {
		speed = s;
	}
	// getter <<
	public int getSpeed() {
		return speed;
	}
	public void setGear(int g) {
		gear = g;
	}
	public int getGear() {
		return gear;
	}
}