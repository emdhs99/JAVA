package javafestival3;

import java.util.Scanner;

public class ex06단수출력 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.print("단수 입력 : ");
			int num1 = sc.nextInt();
			
			
			System.out.print("어느 수까지 출력 : ");
			int num2 = sc.nextInt();	
			
			for(int i = 1; i <= num2;i++ ) {
				System.out.println(num1 + " * " + i + " = " + (num1*i));
			}
			
			
		}

	}