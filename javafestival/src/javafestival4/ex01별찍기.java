package javafestival4;

import java.util.Scanner;

public class ex01별찍기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int num = sc.nextInt();

		
		
		for (int i = 0; i < num; i++) {
			for (int j = 0-1 ; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}


	}
}
