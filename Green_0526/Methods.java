public class Methods {	
	// 숫자 하나가 짝수, 홀수 인지 알고 싶음. 이 기능을 할 수 있는 메소드.
	public static boolean isEven(int number) { // 짝수면 참, 홀수면 거짓
		return number % 2 == 0;
	}
	
	// int isEven(int)
	
	// char isEven(int)
	
	public static int increase(int a) {
		a++;
		return a;
	}
	public static void main(String[] args) {
		// boolean result = isEven(125);
		// System.out.println(result);
		int a = 10;
		
		System.out.println(increase(a));
		System.out.println(a);
	}
	
	// public static int,int createTwoNumber() {
		// return 20,30;
	// }
	
	// public static boolean test() {
		// return 10;
	// }
	
}