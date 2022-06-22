import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BookManage {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String so = new String();

		NextClass[] name = new NextClass[5];

		NextClass book1 = new NextClass("가나", "다라", "복복서가", "장편소설", 12600);
		NextClass book2 = new NextClass("나나", "다라", "나무옆의자", "장편소설", 12600);
		NextClass book3 = new NextClass("가가", "다라", "열림원", "시집", 8100);
		NextClass book4 = new NextClass("다나", "다라", "사이언스북스", "과학 공학", 16650);
		NextClass book5 = new NextClass("자다", "다라", "문학동네", "에세이", 12150);

		name[0] = book1;
		name[1] = book2;
		name[2] = book3;
		name[3] = book4;
		name[4] = book5;

		System.out.println("도서 관리 프로그램");
		System.out.println("press enter..");
		scan.nextLine();
		while (true) {

			System.out.println("1.목록보기   2.작가검색  3.장르별보기   4.가격순으로 보기");
			int input = scan.nextInt();
			if (input == 1) {
				for (int i = 0; i < name.length; i++) {
					System.out.println(name[i]);
				}
			}

			if (input == 2) {
				System.out.println("이름을 입력하세요");
				scan.nextLine();
				String aut = scan.nextLine();
				if (aut.equals("김영하")) {
					// 0,4
					System.out.println(name[0].toString());  //기초타입빼고 전부 객체
					System.out.println(name[4].toString());  //기초타입빼고 전부 객체
				} else if (aut.equals("칼 세이건")) {
					System.out.println(name[3]);
				} else if (aut == "김호연") {
					System.out.println(name[1]);
				}

			} else if (input == 3) {
				System.out.println("1.장편소설   2.에세이   3.과학   4.시집");

				int input2 = scan.nextInt();
				if (input2 == 1) {

					System.out.println("장편소설목록");

				} else if (input2 == 2) {

					System.out.println("에세이목록");

				} else if (input2 == 3) {

					System.out.println("과학목록");

				} else if (input2 == 4) {

					System.out.println("시집목록");

				}

			} else if (input == 4) {
				System.out.println("1.오름차순보기  2.내림차순보기");
				int input3 = scan.nextInt();

				if (input3 == 1) {
					Arrays.sort(name);
					for (NextClass k : name)
						System.out.println(k);
				} else if (input3 == 2) {
					Arrays.sort(name, Collections.reverseOrder());
					for (NextClass j : name) {
						System.out.println(j);
					}

				}

			} else if (input != 1 || input != 2 || input != 3 || input != 4)
				System.out.println("잘못된 입력");

//			String[] skoob = new String[5];

		}
	}

}

class NextClass implements Comparable<NextClass> {

	private String subject;
	private String author;
	private String company;
	private String jeanre;
	private int price;

	public NextClass(String subject, String author, String company, String jeanre, int price) {
		super();
		this.subject = subject;
		this.author = author;
		this.company = company;
		this.jeanre = jeanre;
		this.price = price;

	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getJeanre() {
		return jeanre;
	}

	public void setJeanre(String jeanre) {
		this.jeanre = jeanre;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override

	public String toString() {
		return "NextClass [subject=" + subject + ", author=" + author + ", company=" + company + ", jeanre=" + jeanre
				+ ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((jeanre == null) ? 0 : jeanre.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NextClass other = (NextClass) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (jeanre == null) {
			if (other.jeanre != null)
				return false;
		} else if (!jeanre.equals(other.jeanre))
			return false;
		if (price != other.price)
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		return true;
	}

	@Override
	public int compareTo(NextClass target) {
		return this.price - target.price;
	}

}