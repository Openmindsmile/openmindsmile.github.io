public class Date {
	int year;
	int month;
	int day;
	
	void printYMD() {
		System.out.printf
			("%d-%02d-%02d\n", year, month, day);
	}
	
	void printMDY() {
		System.out.printf
			("%02d/%02d/%s\n", month, day
				, getYearTwoDigit());
	}
	
	String getYearTwoDigit() {
		return String.format
					("%02d", year % 100);
	}
}