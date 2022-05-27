import java.util.Scanner;

public class P101_2 {
			public static void main (String[] args) {
		    Scanner input = new Scanner(System.in);
			
			System.out.print("첫번째 정수를 입력하시오 : ");
			int x = input.nextInt();
			System.out.print("두번째 정수를 입력하시오 : ");
			int y = input.nextInt();
			
			int z = y/x;
			int p = y%x;


			System.out.print(y+"을"+x+"로 나눈 몫은"+z+"이고 나머지는"+p+"입니다");
			


  }
}