
import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
	
		//제네릭으로 타입을 정해주었기때문에 정해진 타입으로만 출력가능해진다
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		int sum = 0;
		for (int i = 0 ; i < list.size(); i++ ) {
			sum += list.get(i);
		}
		System.out.println(sum);
		
	}
	
	
}
