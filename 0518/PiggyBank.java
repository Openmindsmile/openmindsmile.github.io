import java.util.Scanner;
	public class PiggyBank {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
					
			System.out.print(" 500원: ");
			int coina = input.nextInt();
			System.out.print(" 100원: ");
			int coinb = input.nextInt();
			System.out.print(" 50원: ");
			int coinc = input.nextInt();
			System.out.print(" 10원: ");
			int coind = input.nextInt();
			
			int total = ( 500 * coina ) + ( 100 * coinb ) + ( 50 * coinc ) + ( 10 * coind );
			
			
			System.out.print(" 총: " + total + "원");
			
		}
}

//변수의 이름은 숫자로 시작할 수 없다.