
public class TestCar {
	public static void main(String[] args) {
		Car c = new Car("green", 10, 1);
		Car c2 = new Car("yellow");
		Car c3 = new Car("red");
		
		// c.color = "빨강";
		// System.out.println(c.color);
		
		c.setColor("빨강");
		System.out.println(c.getColor());
		
		c.setSpeed(100);
		System.out.println(c.getSpeed());
		
		c.setGear(2);
		System.out.println(c.getGear());
		
		// c2.setColor(null);
		// c3.setColor("새 색상");
	}
}