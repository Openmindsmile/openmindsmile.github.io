// 사용자의 입력 n, m에 대해
// n^m(n의 m제곱)을 출력하기

import java.util.Scanner;

public class Pow {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		long pow = 1;
		for (int i = 0; i < m; i++) {
			pow *= n;
		}
		System.out.println(pow);
	}
}