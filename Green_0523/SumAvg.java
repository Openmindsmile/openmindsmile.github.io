// 사용자가 몇 개의 정수를 입력할지 먼저 정한 후.
// 정수를 입력하면
// 합과 평균을 구해서 출력하는 프로그램.
// 짝수
// 홀수
import java.util.Scanner;

public class SumAvg {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("몇 번?");
		int count = scan.nextInt();
		
		int sumEven = 0;
		int sumOdd = 0;
		int countEven = 0;
		int countOdd = 0;
		for (int i = 0; i < count; i++) {
			// 정수 입력
			int num = scan.nextInt();
			if (num % 2 == 0) {
				sumEven += num;
				countEven++;
			} else {
				sumOdd += num;
				countOdd++;
			}
		}
		
		System.out.println("짝수 합: " + sumEven);
		System.out.println("짝수 평균: " + (sumEven / countEven));
		System.out.println("홀수 합: " + sumOdd);
		System.out.println("홀수 평균: " + (sumOdd / countOdd));
	}
}