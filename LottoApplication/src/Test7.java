import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test7 {

	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> arr5 = new ArrayList<Integer>(6);
		ArrayList<Integer> arr6 = new ArrayList<Integer>(2);
		// DecimalFormat df = new DecimalFormat("## ## ## ## ## ## + ##");

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
			System.out.printf("%02d ", l);
	
		for(int l2 : arr6)
		System.out.printf("%02d ", l2);
	
		System.out.println("");// 줄바꿈
	}
}
