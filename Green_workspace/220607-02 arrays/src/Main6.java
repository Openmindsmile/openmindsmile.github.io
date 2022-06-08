// 사용자가 0이하의 정수를 입력할 때까지 반복하여 입력
// 최근 5개를 출력 (순서 상관없음)

// 예) 10 20 30 40 50 60 70 80 90 100 -1 -> 90 80 70 60 100
import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int MAX_LENGTH = 5;
		int[] arr = new int[MAX_LENGTH];

		int i = 0;

		while (true) {
			int n = scan.nextInt();
			if (n <= 0) {
				break;
			}
			arr[i] = n;

			i++;

			if (i == MAX_LENGTH) {
				i = 0;
			}
		}
		scan.close();
		for (i = 0; i < MAX_LENGTH; i++) {
			System.out.println(arr[i]);
		}

	}

}