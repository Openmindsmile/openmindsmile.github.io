// 강아지 Dog 클래스
public class Dog {
	private String name;
	private String breed;
	private int age;

	// 강아지 3개의 모든 필드를 전달받아 초기화 할 수 있는 생성자
	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	// 강아지 이름, 종을(2개만 전달받은 값) 초기화하고
	// 나이는 1살로 초기화 할 수 있는 생성자
	public Dog(String name, String breed) {
		this(name, breed, 1);
	}

	// 모든 필드를 private 접근 제한자로 정보은닉(캡슐화)하고
	// 각 필드의 public한 getter/setter를 작성해보세용~~
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void printAll() {
		System.out.println(name);
		System.out.println(breed);
		System.out.println(age);
	}
}











