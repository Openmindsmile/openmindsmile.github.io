// 정수 2개를 입력받아서 큰 수에서~ 작은 수로 나눈 몫과 나머지를 출력

import java.util.Scanner;

public class DivMod {
	public static void main(String[] args) {
		// 정수 a, b 입력받기
		Scanner scan = new Scanner(System.in);
		System.out.println("두 개 정수 입력");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int div;
		int mod;
		if (a != 0 && b != 0) {
			if (a > b) {
				// a / b, a % b 계산하기
				div = a / b;
				mod = a % b;
			} else {
				// b / a, b % a 계산하기
				div = b / a;
				mod = b % a;
			}
			// 결과 출력하기
			System.out.println("몫: " + div);
			System.out.println("나머지: " + mod);
		} else {
			System.out.println("0을 입력하면 안되지롱이");
		}
	}
}