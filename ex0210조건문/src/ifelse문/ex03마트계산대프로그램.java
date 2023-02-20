package ifelse문;

import java.util.Scanner;

public class ex03마트계산대프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		System.out.print("상품의 개수를 입력하세요 : ");
		int num = sc.nextInt();
		
		
		if(num >= 11) {
			
			System.out.println("가격은" +(int)(10000 * num * 0.9) + "원 입니다");
			
		} else {

			System.out.println("가격은" +10000 * num + "원 입니다");
		
			}
		
		
		/*
		int money = 0;
		if(num >= 11) {
			money = (int)(10000 * num * 0.9);
		}else {
			money = (int)(10000 * num );
		}
		System.out.println("가격은" + money + "입니다");
		*/
		
		
		
		
		
		
		
		
	}

}
