// 사용자가 정수를 입력받아
// 짝수면 "짝수입니다." 출력
// 홀수면 "홀수입니다." 출력
import java.util.Scanner;

public class IfEven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수? ");
		int number = input.nextInt();
		
		if (number % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
		System.out.println("프로그램 종료");
	}
}