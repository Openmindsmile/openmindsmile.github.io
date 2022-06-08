import java.util.Scanner;
public class Password2 {
   public static void main (String[] args) {
      Scanner enter = new Scanner(System.in);
      
         for (int i =0; i<3; i++) {
         System.out.print("비밀번호를 입력하시오 \n");   
            String pass = enter.nextLine();
            if (pass.equals("김상우123")) {
               System.out.print("정답입니다");
               break;
            }
            else {
               System.out.print("나가리\n");
            }
      }
      
   }
}