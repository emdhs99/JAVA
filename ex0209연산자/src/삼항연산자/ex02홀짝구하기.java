package 삼항연산자;

import java.util.Scanner;

public class ex02홀짝구하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		String result = num % 2 == 1? num + "은(는)홀수입니다." : num + "은(는)짝수입니다." ;	
		
		System.out.println(result);
		
		
		
		
		
		
		
	}

}
