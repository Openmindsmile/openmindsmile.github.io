package first;

public class UpperPackage {
	public static void main(String[] args) {
		first.second.AnotherClass a = new first.second.AnotherClass();
		a.number = 11;
//		a.mySecret = 22;
//		a.test = 33;
	}
}
