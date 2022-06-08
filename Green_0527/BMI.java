public class BMI {
	public static double getBMI(double height, double weight) {
		return weight / (height * height);
	}
	
	public static void main(String[] args) {
		double height = 1.70;
		double weight = 68.4;
		
		// weight / (height * height)
		double bmi = getBMI(height, weight);
		
		System.out.println(bmi);
	}
}