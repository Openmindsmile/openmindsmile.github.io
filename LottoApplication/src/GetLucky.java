import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GetLucky{
	
	public void make() {
		
		//김태한
        //수 출력 메소드입니다	
		//1자리 수 앞에 0이 붙어 출력됩니다
	ArrayList<Integer> arr5 = new ArrayList<Integer>(6);
		
		
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
		System.out.println("");// 줄바꿈
		
		
		
	}
	
}

