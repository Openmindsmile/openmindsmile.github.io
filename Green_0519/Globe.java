import java.util.Scanner;

// 구의 반지름 - 사용자 콘솔 입력 (실수형)
// 구의 부피 4/3r^3

public class Globe {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("구의 반지름 입력해주세요");
		double radius = scan.nextDouble();
					
		System.out.println("반지름 확인 : " + radius);
		System.out.println("반지름 세제곱 확인 : " + radius * radius * radius);
		System.out.println("4 / 3 확인 : " + 4.0 / 3.0);
		
		double volume = radius * radius * radius * 4 / 3;
		
		System.out.println("구의 부피: " + volume);
	}
}