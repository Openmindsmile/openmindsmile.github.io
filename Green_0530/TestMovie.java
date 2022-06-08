// 쌤 답
public class TestMovie {
	public static void main(String[] args) {
		// 생성자(constructor)
		// 기본 생성자
		// 기본값으로 초기화
		// 정수형 -> 0
		// 실수형 -> 0.0
		// 논리형 -> false
		// 참조형 -> null
		Movie m = new Movie(
						"새영화"
						, 7.5
						, "새감독"
						, 2022);
	
		System.out.println(m.title);
		System.out.println(m.score);
		System.out.println(m.director);
		System.out.println(m.publishYear);
		// m.printAll();

		// Movie m = new Movie();
		// m.title = "범죄도시2";
		// m.score = 9.5;
		// m.director = "이상용";
		// m.publishYear = 2022;
		
		// m.printAll();
		
		// Movie m2 = new Movie();
		// m.title = "위대한 개츠비";
		// m.score = 9.2;
		// m.director = "배즈 루어먼";
		// m.publishYear = 2013;
	}
}