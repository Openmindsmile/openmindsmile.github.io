import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main9 {
	public boolean isNumberChar {}
	
	
	
	
	
	
	
  public static void main(String[] args) {
	
	  List<String> list = new ArrayList<>(Arrays.asList
			  ("apple","banana","carrot","donut","egg"));
	  
	  //위의 리스트에서
	  //문자열의 길이가 5글자인 문자열만을 원소로 가지는 리스트 생성
	  
	  List<String> copy = new ArrayList<>(list);
	  Iterator<String> iterator = copy.iterator();
	  whlie (iterator.hasNext()){
		  String str = iterator.next();
		  if(str.length() != 5) {
			  iterator.remove();
		  }
	  }
	  
	  
	  

//	  binarysearch
//	  indexOf
//	  
	 
	  //문자열 중에 e 문자를 포함하는 문자열만을 원소로 가지는 리스트 생성
	  List<String> empty = new ArrayList<>();
	  for (int i = 0; i < list.size(); i++) {
		  String str = list.get(i);
		  if(str.contains("e")) {
			  empty.add(str);
		  }
	  }
	  
	
	  
	  
	  //
	  List<String> list2 = new ArrayList<>(Arrays.asList("가","1","@","3","나"));
	  
	  //위의    2번 리스트에서 정수형태의 값을 가지는 문자열을 찾아
	  // 해당 원소를 가지는 정수형 리스트 생성
	 // Integer i = Integer.valueOf("1234"); // => 1234 Integer반환
	 // Integer exp = Integer.valueOf("숫자아니면?"); // => NumberFormatException예외발생
	  
	  List<Integer> listInteger = new ArrayList<>();
	  
	  for(int i = 0 ; i < list2.size(); i++) {
		  String str = list2.get(i);
		  try{
			  Integer value = Integer.valueOf(str);
			  listInteger.add(value);
			  
		  }catch (NumberFormatException e) {
			  System.out.println("");
		  }
	  }
	  
	  
	  
}
}
