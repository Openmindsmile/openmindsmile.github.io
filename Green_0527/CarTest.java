class Car {
	// 필드 정의
	String color; // 색상
	int speed; // 현재 속도
	int gear; // 현재 기어
	
	void print() {
		System.out.print("(" + color + ", " + speed + ", " + gear +")");
	}
}
public class CarTest {
	public static void main(String[] args) {
		// {
			// int a = 100;
			// Car someCar = new Car();
		// }
		Car myCar = new Car();
		myCar.color = "red";
		myCar.speed = 0;
		myCar.gear = 1;
		myCar.print();
		
		// 색상:blue 속도:60 기어:3
		myCar.color = "blue";
		myCar.speed = 60;
		myCar.gear = 3;
		
		Car yourCar = new Car();
		yourCar.color = "blue";
		yourCar.speed = 60;
		yourCar.gear = 3;
	}
}