package 이차원배열;


public class ex03스네이크 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];

		int num = 21;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = num++;
			}
		}

		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < 5; j++) {
					System.out.print(array[i][j] + "\t");
				}
			} else {
				for (int j = 4; j >= 0; j--) {
					System.out.print(array[i][j] + "\t");
				}

			}
			System.out.println();

		}

	}

}
