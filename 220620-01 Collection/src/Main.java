


//배열의 단점인 정해진 사이즈가 아닌 자유롭게 사용하기 편한 형태로 제공하는 클래스 - ArrayList

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("문자열 객체");
		list.add(new Object());
		list.add(Integer.valueOf(100));
		list.add(Double.valueOf(55.55));
		//ArrayList는 기본형 타입은 다룰 수 없고, 객체만 다룰 수 있다
		
		list.add(500); //auto-boxing :자동으로 객체로 만들어주는 것(참조가 들어간것)
		list.add(123.123);// ''
		
		
		int size = list.size();
		System.out.println(size);
		
		System.out.println(list.get(0)); //접근하기.객체이기 때문에 get
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		for(int i = 0 ;i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for(int i = list.size() - 1; i >= 0; i--) {
		System.out.println(list.get(i));	
		}
		
		
		
	}
}
