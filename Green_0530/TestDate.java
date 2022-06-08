public class TestDate {
	public static void main(String[] args) {
		Date d = new Date();
		d.year = 2022;
		d.month = 5;
		d.day = 27;
		
		// d.printYMD();
		d.printMDY();
		
		// String year = d.getYearTwoDigit();
		// System.out.println(year);
		
		// d.printYMD();
	}
}