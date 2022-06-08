import java.util.Scanner;
public class SumForUser {
	public static void main(String[] args) {
		// 사용자가 정수 범위를 지정 (시작-끝 입력)
		// 합
		Scanner scanner = new Scanner(System.in);
		System.out.print("시작? 끝? ");
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}