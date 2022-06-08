// 사용자에게 초단위의 시간(정수)을 입력받아
// 시간 분 초로 변환을 하는 프로그램

// 입력예) 3666
// 출력예) 1시간 1분 6초
import java.util.Scanner;

public class SecToTime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초 단위의 정수를 입력하세요.");
		int second = scanner.nextInt();
		
		// System.out.println("입력한 수: " + second); // 확인
		int hour = second / 3600;
		int minute = (second % 3600) / 60;
		int secondCal = second % 60;
		
		System.out.println(hour + "시간");
		System.out.println(minute + "분");
		System.out.println(secondCal + "초");
	}
}