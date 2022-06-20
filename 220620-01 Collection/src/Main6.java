import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main6 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(7, 3, 2, 8, 9, 1));
		
		Collections.sort(list); //순서대로 배열
		System.out.println(list);
		
		int index = Collections.binarySearch(list, 8);
		System.out.println("8의 인덱스" + index);
		
		Collections.reverse(list); //거꾸로 출력
		System.out.println(list);
		
		Collections.shuffle(list); //섞어서 출력
		System.out.println(list);
		
		System.out.println(Collections.max(list)); //최대값
		System.out.println(Collections.min(list)); //최소값
		
		Collections.fill(list,33); //모든값을 삽입한 값으로 변환
		System.out.println(list);
		
		Collections.replaceAll(list, 33, 77);  // (리스트의, 해당값을, 이 값으로 변환)
		System.out.println(list);
		
		//list.clear();
		
		List<Integer> target = new ArrayList<>(Arrays.asList(90,80,70));
		Collections.copy(list, target);
		
		System.out.println(list);
		
		
	}
}
