public class SwitchCase {
	public static void main(String[] args) {
		int i = 2;

		switch (i) {
			case 1:
			System.out.println("일");
			break;
			case 2:
			System.out.println("이");
			break;
			case 3:
			System.out.println("삼");
			break;
			default:
			System.out.println("일이삼 아님");
		}
		
		System.out.println("프로그램 종료");
	}
}