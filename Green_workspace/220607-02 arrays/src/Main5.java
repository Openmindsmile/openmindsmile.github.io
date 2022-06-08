import java.util.Scanner;

// 사용자에게 5번의 정수를 입력받아
// 최근 입력한 순(역순)으로 출력하기

// 예) 10 20 30 40 50 -> 50 40 30 20 10



public class Main5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
}
