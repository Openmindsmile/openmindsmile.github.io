public class Add { 
	public static void main(String[] args) {

		//클래스이름은 대문자로 시작, 변수이름은 소문자로 시작(대소문자를 구별)
		//숫자도 올 수 있음 (영문뒤에)
		//공백은 포함 할 수 없다.
		//특수문자는 '-','_' 둘만 사용가능
	        // int : 정수형 data type (자료형)
		// 중복되는변수 선언 불가
		
	   int x; // 변수선언 (Variable Declare) - 변수는 기억을 위한 공간이라고 생각해보자
	   int y;
           int sum;

	  
	  // 초기화 (initialize)
	   x=100; // '='는 '같다'가 아닌 대입연산자로써 오른쪽에 있는것을 왼쪽으로 집어넣는개념.
           y=200;
           sum = x + y ;

	System.out.println(sum);
	 // return은 메인메소드의 종료를 의미 = }중괄호와 같은 기능. 끝이므로 아래에 더이상 문장이 올 수 없다.


	System.out.println(x - y);
    
        int minus;
	minus = x - y;
        System.out.println(minus);

      }

}

