import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

class Plan6 extends JFrame {

	// 김태한
	public void six() { //배경 프레임 메소드

		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("-Green Lotto-");// 프레임 타이틀
		// FlowLayout f = new FlowLayout();
		setLayout(new FlowLayout());
		setVisible(true);
		Container contentPane = getContentPane(); // 컨텐트팬 알아내기
		contentPane.setBackground(Color.darkGray); // 배경색
		contentPane.setLayout(new FlowLayout());

	}

	public void pnl() {

		JPanel jpl = new JPanel();

		
		// contentPane.add(new JButton("OK")); // 확인버튼
		// contentPane.add(new JButton("Cancel")); // 취소버튼
		

		setVisible(true); // 화면에 프레임 출력

	}

	public void lbl() {

	}

	public void arr() { //랜덤출력 메소드

		// ArrayList<String> al = new ArrayList<>();

		ArrayList<Integer> arr1 = new ArrayList<Integer>(6);
		ArrayList<Integer> arr2 = new ArrayList<Integer>(6);
		ArrayList<Integer> arr3 = new ArrayList<Integer>(6);
		ArrayList<Integer> arr4 = new ArrayList<Integer>(6);
		ArrayList<Integer> arr5 = new ArrayList<Integer>(6);
		
		//////////////// 1번째 줄 ////////////////
		Random rd = new Random();
		Integer ig = null;
		while (arr1.size() < 6) { /// arr1배열의 길이
			// 난수 발생
			ig = new Integer(rd.nextInt(45) + 1);
			// 중복값 체크
			if (!arr1.contains(ig)) {
				arr1.add(ig);
			}
		}
		Collections.sort(arr1);// 오름차순
		for (int i : arr1)
			System.out.print(i + "\t");
		System.out.println("");// 줄바꿈
		
		////////////// 2번째 줄 /////////////////
		Random rd2 = new Random();
		Integer ig2 = null;
		while (arr2.size() < 6) { /// arr1배열의 길이
			// 난수 발생
			ig2 = new Integer(rd2.nextInt(45) + 1);
			// 중복값 체크
			if (!arr2.contains(ig2)) {
				arr2.add(ig2);
			}
		}
		Collections.sort(arr2);// 오름차순
		for (int j : arr2)
			System.out.print(j + "\t");
		System.out.println("");// 줄바꿈
		
		////////////// 3번째 줄 /////////////////
		Random rd3 = new Random();
		Integer ig3 = null;
		while (arr3.size() < 6) { /// arr1배열의 길이
			// 난수 발생
			ig3 = new Integer(rd3.nextInt(45) + 1);
			// 중복값 체크
			if (!arr3.contains(ig3)) {
				arr3.add(ig3);
			}
		}
		Collections.sort(arr3);// 오름차순
		for (int k : arr3)
			System.out.print(k + "\t");
		System.out.println("");// 줄바꿈
		
		////////////// 4번째 줄 /////////////////
		Random rd4 = new Random();
		Integer ig4 = null;
		while (arr4.size() < 6) { /// arr1배열의 길이
			// 난수 발생
			ig4 = new Integer(rd4.nextInt(45) + 1);
			// 중복값 체크
			if (!arr4.contains(ig4)) {
				arr4.add(ig4);
			}
		}
		Collections.sort(arr4);// 오름차순
		for (int f : arr4)
			System.out.print(f + "\t");
		System.out.println("");// 줄바꿈
		
		////////////// 5번째 줄 /////////////////
		Random rd5 = new Random();
		Integer ig5 = null;
		while (arr5.size() < 6) { /// arr1배열의 길이
			// 난수 발생
			ig5 = new Integer(rd5.nextInt(45) + 1);
			// 중복값 체크
			if (!arr5.contains(ig5)) {
				arr5.add(ig5);
			}
		}
		Collections.sort(arr5);// 오름차순
		for (int l : arr5)
			System.out.print(l + "\t");
		System.out.println("");// 줄바꿈
		
				

		int a = 1;
		int b = 1;
		int c = 1;
		int d = 1;
		int e = 1;

		arr1.add(0, a);
		arr2.add(0, b);
		arr3.add(0, c);
		arr4.add(0, d);
		arr5.add(0, e);
		
		;
		
		
	}

}

public class Lotto1 {

	public static void main(String[] args) {
		Plan6 plan = new Plan6();
		//plan.getContentPane().setBackground(UIManager.getColor("desktop"));

		plan.six();
		plan.pnl();
		plan.arr();
		
	}
}
