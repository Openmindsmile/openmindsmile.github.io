import java.util.Scanner;
public class SphereVolume {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("구의 반지름을 기입하시오 :");
		double x = input.nextDouble();
				
		System.out.print("구의 부피는 : " +  x * x * x * 4/3);
		
	}
}

