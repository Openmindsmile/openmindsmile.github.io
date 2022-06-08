
public class CarTest3 {
	public static void main(String[] args) {
		int n = Car.getNumberOfCars();
		System.out.println("지금까지 생성된 자동차 수 = " + n);
		
		Car c1 = new Car("blue", 100, 1);
		Car c2 = new Car("white", 0, 1);
		
		n = Car.getNumberOfCars();
		System.out.println("지금까지 생성된 자동차 수 = " + n);
	}
}
