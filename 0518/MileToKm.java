import java.util.Scanner;

public class MileToKm {
	public static void main (String[] args){
		
		System.out.print("마일을 입력하시오.");
		Scanner input = new Scanner(System.in);
		double mi = input.nextDouble();
		double km;
		double sum;
		
		sum = mi*1.609;
		
		System.out.print( sum + "km" );
		
	
	
	
	}

}