public class OnelineIf {
	public static void main(String[] args) {
		boolean con = false;
		
		// ? 삼항연산자
		// String result = (con) ? "참" : "거짓";
		
		// int r;
		// if (con) {
			// r = 100;
		// } else {
			// r = -100;
		// }
		
		int result = (con) ? 100 : -100;
		
		
		System.out.println(result);
		
		System.out.println("프로그램 종료");
	}
}