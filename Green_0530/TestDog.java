public class TestDog {
	public static void main(String[] args) {
		Dog d1 = new Dog("초코", "푸들", 7);
		Dog d2 = new Dog("예삐", "말티즈");
		
		d1.printAll();
		d2.printAll();
	}
}