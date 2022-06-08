public class StringConcatLength {
	public static int getTotalLength(String str1, String str2) {
		return str1.length() + str2.length();
	}
	
	public static void main(String[] args) {
		int length = getTotalLength("abcde", "가나다라");
		System.out.println(length);
	}
}