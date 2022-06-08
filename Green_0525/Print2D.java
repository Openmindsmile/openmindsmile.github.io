// (1, 1) (1, 2) (1, 3) (1, 4)
// (2, 1) (2, 2) (2, 3) (2, 4)
// (3, 1) (3, 2) (3, 3) (3, 4)
// (4, 1) (4, 2) (4, 3) (4, 4)

public class Print2D {
	public static void main(String[] args) {
		for (int j = 1; j <= 4; j++) {
			for (int i = 1; i <= 4; i++) {
				System.out.printf("(%d, %d) ", j, i);
			}
			System.out.println();
		}
	}
}