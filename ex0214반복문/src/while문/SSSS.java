package while문;

import java.util.Random;
import java.util.Scanner;

public class SSSS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();
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
