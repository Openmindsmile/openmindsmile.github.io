import java.util.Scanner;

public class Timecal {
	public static void main (String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력하세요");
		
		int s = scanner.nextInt();
		
		int h = s/3600;
		int m = s%3600/60;
		int se = s%3600%60;
		
		System.out.println( h +"시간" + m + "분" + se + "초");
		
	}
}