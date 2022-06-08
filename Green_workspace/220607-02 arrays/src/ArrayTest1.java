import java.util.Scanner;

public class ArrayTest1 {
	public static void main(String[] args) {
		final int STUDENTS = 5;
		
		Scanner scan = new Scanner(System.in);
		
		int[] scores = new int[STUDENTS];
		
		for (int i = 0; i < STUDENTS; i++) {
			System.out.print("성적을 입력하시오:");
			scores[i] = scan.nextInt();
		}
		
		int total = 0;
		for (int i = 0; i < STUDENTS; i++) {
			total += scores[i];
		}
		
		System.out.println("평균 성적은" + total / STUDENTS + "입니다");
	}
}
