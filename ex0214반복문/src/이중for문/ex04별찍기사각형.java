package 이중for문;

public class ex04별찍기사각형 {

	public static void main(String[] args) {
		
		for (int j = 1; j < 6; j++) {

			for (int t = 5; t > 0; t--) {
				if (t > j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			for (int i = 1; i < 5; i++) {
				if (i < j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int j = 5; j > 0; j--) {

			for (int t = 5; t > 0; t--) {
				if (t < j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int i = 2; i < 5; i++) {
				if (i < j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
