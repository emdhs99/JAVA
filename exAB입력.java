package fesrival2일차;

import java.util.Scanner;

public class exAB입력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("A입력 >> ");
			int num1 = sc.nextInt();

			System.out.print("B입력 >> ");
			int num2 = sc.nextInt();

		
			if (num1 == 0) {
				if (num2 == 0) {
					System.out.println("종료되었습니다.");
					break;
				}
			}
			System.out.println("결과 >> " + (num1 - num2));
		}
		
	}

}
