// 사용자의 직사각형의 밑변과 높이를 정수로 입력
// 직사각형의 둘레와 넓이를 출력

// 정수 입력은 Scanner 객체의 nextInt

// 둘레는 (밑변 + 높이) * 2
// 넓이는 (밑변 * 높이)
import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		System.out.println("사각형 둘레, 넓이 구하기~");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("밑변을 입력하세요: ");
		int length = scanner.nextInt();
		System.out.print("높이를 입력하세요: ");
		int height = scanner.nextInt();
		
		System.out.println("둘레: " + (length + height) * 2);
		System.out.println("넓이: " + (length * height));
	}
}
