// 사용자의 점수(정수형)를 입력받아
// 60점 이상이면 "합격" 출력
// 60점 미만이면 "불합격" 문자열과 부족한 점수도 같이 출력

import java.util.Scanner;

public class TestScore {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수? ");
		int score = scan.nextInt();
		
		if (score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
			System.out.printf("부족한 점수: %d", 60 - score);
		}
	}
}