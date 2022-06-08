// 주민번호를 입력하면
// 성별을 출력하는 프로그램
// 예) xxxxxx-1xxxxxx
import java.util.Scanner;

public class KoreanCode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호 ?");
		String code = scan.nextLine();
		String result;
		
		if (code.length() == 14) {
			char c = code.charAt(7);
			switch (c) {
				case '1': case '3':
					result = "남성";
					break;
				case '2': case '4':
					result = "여성";
					break;
				default:
					result = "잘못 입력";
					break;
			}
		} else {
			result = "잘못 입력";
		}
		System.out.println(result);
	}
}