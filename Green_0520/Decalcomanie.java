import java.util.Scanner;

public class Decalcomanie {
   public static void main (String[] args) {
      Scanner enter = new Scanner(System.in);
      
      System.out.print("정수 4자리를 입력하시오");  
      int n = enter.nextInt (); 
      
      int c = n/1000; 
      int d = n%1000/100;
      int e = n%1000%100/10;
      int f = n%1000%100%10/1;
   
     
      System.out.println((c==f) && (d==e));
   
         
   }
}