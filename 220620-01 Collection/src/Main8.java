import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;


public class Main8 {

	public static void main(String[] args) {
		
//	    int i = 0;
//		int sum = 0;
//		for( ; i <= 79 ; i ++)
//			(i == ArrayList);
//			sum += i;
	
//		for(int i, sum = 0; i <= 79 ; i++) {
//			sum += i;
		List<Integer> list = new ArrayList<>(Arrays.asList(3, 23, 35, 11, 23, 57, 79));
//		Collections.binarySearch(list,i);
//		
				
		//합, 평균
		int sum = 0;
		for (int i = 0; i < list.size(); i++)
			sum+= list.get(i);
	System.out.println(sum);
	
		
		//점수    57이 리스트에 있sms지?있으면 몇번째 index에 있는지
	System.out.println(list.contains(57));
	System.out.println(list.indexOf(57));
	
	
		//정수 23의 개수
	int count = 0;
	for (int i = 0; i < list.size(); i++ ) {
		if(list.get(i) == 23) {
			count++;
			System.out.println(count);
		}
	}
		
		//중복되는 원소 23을 하나 삭제하기		
		
	//int index = list.lastIndexOf(23);
	list.remove(Integer.valueOf(23));
	System.out.println(list);
	
	}
	
}
