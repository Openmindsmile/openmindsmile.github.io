public class Circle {
	public static double getCircleArea(double radius) {
		return radius * radius * 3.14;
	}
		
	public static void main(String[] args) {
		double area;
		
		area = getCircleArea(7);
		
		System.out.println(area);
	}
}