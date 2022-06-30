import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Test5 {

	public static void main(String[] args) {

		// 김태한
		// 수 출력 메소드입니다
		// 1자리 수 앞에 0이 붙어 출력됩니다
		ArrayList<Integer> arr5 = new ArrayList<Integer>(6);
		// DecimalFormat df = new DecimalFormat("## ## ## ## ## ## + ##");

		Random rd5 = new Random();
		Integer ig5 = null;

		while (arr5.size() < 7) { /// arr1배열의 길이
			// 난수 발생
			ig5 = new Integer(rd5.nextInt(45) + 1);
			// 중복값 체크
			if (!arr5.contains(ig5)) {
				arr5.add(ig5);
			}
		}

		Collections.sort(arr5);// 오름차순
		for (int l : arr5)
			System.out.printf("%02d ", l);
		System.out.println("");// 줄바꿈

		Random rd1 = new Random();
		Integer ig1 = null;

		// int j = 0;
		
		
		while (true) {
			for (int i = 0; i < arr5.size(); i++) {

				ig1 = new Integer(rd1.nextInt(45) + 1);

				if (!(arr5.get(i) == ig1)) {
					System.out.println(ig1);
				}
				break;
			}
			break;
		}
		
		
		
	}

}

// System.out.println(arr5.get(2));
