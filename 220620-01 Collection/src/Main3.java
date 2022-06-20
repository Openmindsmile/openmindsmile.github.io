
import java.util.ArrayList;
import java.util.List;


public class Main3 {

	public static void main(String[] args) {
	
			List<Integer> list = new ArrayList<>();
			
			for(int i = 1; i <= 4 ; i++) {
				list.add(1 * 10);
			}
			
			System.out.println(list.toString());
			list.set(1,15);// set메소드 사용(인덱스순서,바꿔줄 값)
			System.out.println(list);
			
			System.out.println(list.contains(20));
			System.out.println(list.indexOf(30));
			
			list.remove(2); //해당인덱스 값 지우기
			System.out.println(list);
			
			list.add(0,0); //인덱스값 추가(인덱스순서, 바꿔줄 값)
			System.out.println(list);
			//인덱스를 빼거나 추가함으로 인해 뒤의값이 앞으로 오거나
			//있던값이 뒤로 밀려난다
			
			//list.clear(); // clear메소드 - 리스트값 지우기
			
			//for (int i = 0; i < list.size(); i++) {
			//list.remove(i); 반복문으로 값 지우기
			
			System.out.println("지운결과: " + list);
			System.out.println(list.size() == 0);
			System.out.println(list.isEmpty());
			
			
			
			}
	}

