import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Main4 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("apple");
		list.add("banana");
		list.add("carrot");
		list.add("donut");

		Iterator<String> iterator = list.iterator();//원소 하나하나를 볼수있게 도와주는 객체
		while(iterator.hasNext()){
		//System.out.println(iterator.next());
			String str = iterator.next();
			if(str.length() == 5) 
				iterator.remove();         //순환하며 5자 단어에 해당되는 것 지우기,
				                           //순환작업에는 iterator가 필수
			System.out.println(list);
				
			}
		}
		
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
		
//		System.out.println(list.contains(new String("banana")));
//		list.remove("banana");
//
//		System.out.println(list); 원하는 원소 찾아 지우기
		
		
		//위의 리스트에서 5글자 문자열만 찾아 지우기
		
		
		

	}

}
