// 사용자에게 비밀번호를 물어보고 동일할 경우 통과
// 최대 3번의 기회를 줌

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String password = "1q2w3e";
		String userInput;
		boolean isOk = false;
		int count = 3;
		do {
			System.out.println("비밀번호를 입력하세요");
			userInput = scan.nextLine();
			count--;
			System.out.println("현재 카운트값 확인 : " + count);
			isOk = password.equals(userInput);
			// 비밀번호가 틀렸고 아직 기회가 남아있으면
		} while (!isOk && count > 0);
		
		if (isOk) {
			System.out.println("통과~~");
		} else {
			System.out.println("비밀번호를 확인해주세영");
		}
	}
}