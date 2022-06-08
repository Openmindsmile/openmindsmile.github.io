// 사용자의 학점
// 점수를 입력받아
// 90점 이상 A
// 80점 이상 90점 미만 B
// 70점 이상 80점 미만 C
// 60점 이상 70점 미만 D
// 60점 미만 F

import java.util.Scanner;

public class ScoreText {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수는? ");
		int score = scanner.nextInt();
		
		char grade;
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("학점은 " + grade);
	}
}