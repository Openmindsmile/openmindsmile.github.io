
//사용자가 입력한 4자리의 정수가 좌우가 같을 때 tRUE를 출력하세요. 나머지는 False.

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("네자리의 숫자를 입력하시오 :");	
	int number = scan.nextInt();
	
		
	int number1 = number % 10;
	int number4 = ( number / 1000 );	
	
	System.out.print(number1 == number4);

	
	}
	
	
}