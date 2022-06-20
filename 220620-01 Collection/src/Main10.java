import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class Main10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> list = new ArrayList<>(Arrays.asList(
				"Apple","Grapes","Orange","Pear","Watermelon"));
		
		//콘솔 입출력
		//과일목록 보여주기
		//고객에게 과일주기(가장 앞의 것부터.)
		//재고 과일 추가하기(가장 마지막에 추가)-최대 10개 진열	
		
		System.out.println("Welcome..Press Any NumberKey..");
		System.out.println(list);
		System.out.println();
		System.out.println();
		
		//System.out.println("Apple" + " " + "Grapes" + " " + "Orange" + " " + "Pear" + " " + "Watermelon");
		//////////////////////////////////
		System.out.println();
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
		String str = iterator.next();
		
		
		
		System.out.println("Goodbye Apple");
		list.remove("Apple");
		}
		
		
		System.out.println("Welcome..Press Any NumberKey..");
		System.out.println(list);
		System.out.println("Goodbye Grapes");
		list.remove("Grapes");
		
		
		System.out.println("Welcome..Press Any NumberKey..");
		System.out.println(list);
		System.out.println("Goodbye Orange");
		list.remove("Orange");
		
		
		System.out.println("Welcome..Press Any NumberKey..");
		System.out.println(list);
		System.out.println("Goodbye Pear");
		list.remove("Pear");
		
	
		System.out.println("Welcome..Press Any NumberKey..");
		System.out.println(list);
		System.out.println("Goodbye Watermelon");
		list.remove("Watermelon");
		
		
		
	}
}
