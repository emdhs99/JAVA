package javafestival3;

import java.util.Scanner;

public class ex04n항출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n 입력 : ");
		int num = sc.nextInt();

//		int i = 0;
//		while(true) {
//			System.out.print(i+1+i);
//			i++;
//		}
		int num1 = 1;
		for (int i = 1; i <= num ; i++ ) {
			System.out.print(num1 + " ");
			num1 += i;
		}
		
		
		
		
	}

}
