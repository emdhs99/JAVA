package while문;

import java.util.Scanner;

public class ex04while문예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num2 = 0;
		int num3 = 0;

		while (true) {
			System.out.print("숫자 입력 : ");
			int num1 = sc.nextInt();

			if (num1 % 2 == 1) {
				num3++;

			} else if (num1 % 2 == 0) {
				num2++;
				
			} else if (num1 == -1) {
				System.out.println("종료되었습니다.");
				break;
			}
			System.out.println("홀수개수 : " + num3);
			System.out.println("짝수개수 : " + num2);
		}

	}

}
