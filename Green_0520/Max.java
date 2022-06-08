// 3개의 정수를 입력받아
// 가장 큰 수를 출력하세요.

import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("3개의 정수를 입력하세요");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int max;
		if (a > b) {
			if (a > c) {
				max = a;
			} else {
				max = c;
			}
		} else {
			if (b > c) {
				max = b;
			} else {
				max = c;
			}
		}

		System.out.println("가장 큰수는 : " + max);
	}
}