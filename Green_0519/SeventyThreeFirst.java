import java.util.Scanner;

public class SeventyThreeFirst {
   public static void main(String[] args) {
      System.out.println("마일을 킬로미터 값으로 변환시키기"); 
      
      Scanner enter = new Scanner(System.in);
      System.out.print("마일을 입력하시오");
      
      double m = enter.nextDouble();
      double k = m * 1.609;
      
      System.out.println(k + "km"); 
   }
}