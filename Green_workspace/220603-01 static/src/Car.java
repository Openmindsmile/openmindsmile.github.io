public class Car {
	private String color;
	private int speed;
	private int gear;
	private int id;
	
	private static int numberOfCars = 0;

	public Car(String color, int speed, int gear) {
		this.color = color;
		this.speed = speed;
		this.gear = gear;
		
		numberOfCars++;
		id = numberOfCars;
	}
	
//	public static void printColor() {
//		System.out.println(color);
//	}
	
	public static int getNumberOfCars() {
		return numberOfCars;
	}
}
