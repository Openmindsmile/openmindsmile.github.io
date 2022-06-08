public class TestBook {
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.title = "Power Java";
		book1.author = "천인국";
		book1.printAll();
		
		// System.out.println(book1.title);
		
		book1.author = "천인국, 하상호";
		book1.printAll();
		
		Book book2 = new Book();
		book2.title = "무기여 잘 있거라";
		book2.author = "어니스트 허밍웨이";
		book2.printAll();
	}
}