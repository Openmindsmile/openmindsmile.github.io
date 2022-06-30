import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2{
	
	public void single() {

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
		System.out.printf("%02d", l , "\t");
		System.out.println("");// 줄바꿈
		
		
		
		
	}
	
}//

창띄움
매 게임마다 수동 자동 선택버튼
수동 선택한 경우 직접 텍스트필드에 기입
자동 선택한 경우 랜덤 함수 텍스트 필드에 호출 








































