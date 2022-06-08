// 사용자가 입력한 두 개의 숫자를 더해서 출력한다.
import java.util.Scanner; // Scanner 클래스 포함

public class Add2 {
	// 메인 메소드에서부터 실행이 시작된다.
	public static void main(String args[]) {
		// 사용자로부터 입력을 받기위해 Scanner의 Instance 생성한다.
		Scanner input = new Scanner(System.in);

		int x; // 첫 번째 숫자 저장
		int y; // 두 번째 숫자 저장
		int sum; // 합을 저장

		System.out.print("첫번째 숫자를 입력하시오: "); // 입력 안내 출력
		x = input.nextInt(); // 사용자로부터 첫 번째 숫자를 읽는다.

		System.out.print("두번째 숫자를 입력하시오: "); // 입력 안내 출력
		y = input.nextInt(); // 사용자로부터 두 번째 숫자를 읽는다.

		sum = x + y; // 두 개의 숫자를 더한다.

		System.out.println(sum); // 합을 출력한다.

	} // 메인 메소드의 끝

} // Add 클래스의 끝
