// 4단 말고도... 사용자의 입력을 받아 원하는 단수의 구구단 출력하는 프로그램.
import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		// 4 * 1 = 4
		// 4 * 2 = 8
		// 4 * 3 = 12
		// 4 * 4 = 16
		// 4 * 5 = 20
		// 4 * 6 = 24
		// 4 * 7 = 28
		// 4 * 8 = 32
		// 4 * 9 = 36
		// int i = 1;
		// while (i <= 9) {
			// System.out.printf("%d * %d = %d\n", 4, i, 4 * i);
			// i++;
		// }
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int i = 1;
		while (i <= 9) {
			System.out.printf("%d * %d = %d\n", input, i, input * i);
			i++;
		}
	}
}