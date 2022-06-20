import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main7 {

	public static void main(String[] args) {
		//1.2의 배수를 5개 가지는 정수형리스트 생성 및 초기화 해보기
		
		List<Integer> listTwos = new ArrayList<>(Arrays.as2,4,6,8,10);
				
//		List<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
//		System.out.println(list);
//		
//		for(int i = 2; i <= 10 ; i++) {
//		     if(!(i % 2 == 0))
//		    	 continue;
//		List<Integer> list5 = new ArrayList<>(Arrays.asList(i));
//		System.out.print(list5);
//		}
//		
//		
//		List<Integer> list4 = new ArrayList<>(Arrays.asList());
//				
		
		//2.7의배수를 5개 가지는 정수형리스트 생성및 초기화
		//7,14,21,28,35
	    List<Integer> list2 = new ArrayList<>(Arrays.asList(7, 14, 21, 28, 35));
		System.out.println(list2);
		
		
		//3.위의 리스트의 원소들을 모두 다 가지는 리스트 
		List<Integer> list3 = new ArrayList<>();
		listAll.addAll(listTwos)
		
		
		
		
		//4.3번의 리스트를 오름차순으로 정렬된 원소를 가지는 리스트	
				
				
		
		//
		//(Random 객체를 사용하여)0~10사이의 난수를 6개 가지는 리스트(각 숫자값은 중복되지 않아야함)
		List<Integer> listRandom();
		Random rd = new Random();
		while (listRandom.size() < 6){
			int result = Random.nextInt(11);
			if (!listRandom.contains(result)) {
				listRandom.add(result);
			}
		}	
		
		
	}
}
