package dowhile문;

import java.util.Random;
import java.util.Scanner;

public class ex랜덤수만들기 {

	public static void main(String[] args) {
		// 랜덤 수를 뽑아내는 방법
		// 1. 랜덤한 수를 추출해주는 도구 꺼내오기!!
		Scanner sc = new Scanner(System.in);

		Random ran = new Random();

		int i = 0;
		while (true) {
			int ranNum = ran.nextInt(10);
			int ranNum2 = ran.nextInt(10);
			System.out.print(ranNum + " + " + ranNum2 + " = ");
			int num = sc.nextInt();

			if (ranNum + ranNum2 == num) {
				System.out.println("SUCCESS!");
			} else {
				System.out.println("Fail...");
				i++;
			}
			if (i > 4) {
				System.out.println("GAME OVER!!");
				break;
			}

		}

	}
}
