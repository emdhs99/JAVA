package switc문;

import java.util.Scanner;

public class ex자판기프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		System.out.println("메뉴를 고르세요 : ");
		System.out.println("1.이구동성(700원) 2.썬칩(1000원) 3.뽀빠이(500원)");
		int number = sc.nextInt();
		
		int change = money;
		
		if(number == 1 ) {
			if(money >= 700) {
			change = money - 700;
		}else { 
			System.out.println("돈이 부족해요!!");
		} 
			
		}
		if(number == 2 ) {
			if(money >= 1000) {
			change = money - 1000;
		} else {
			System.out.println("돈이 부족해요!!");
		}
			
		}
		if(number == 3 ) {
			if(money >=500 ) {
			change = money - 500;
		}else {
			System.out.println("돈이 부족해요ㅜㅜ");
		}
		}
		
		
		System.out.println("잔돈은" + change + "입니다" );
		System.out.print(" 천원 : " + change / 1000 );
		System.out.print(" 오백원 : " + change % 1000 / 500 );
		System.out.println(" 백원 : " + change % 500 / 100 );
		
		
//		switch (number) {
//		case 1:
//			if(money - 700 < 0) {
//				System.out.println("돈이 부족해요ㅜㅜ" );
//				System.out.println("잔돈 : " + money);
//			}else
//			System.out.println("잔돈은" + (money - 700) + "입니다");
//			break;
//		case 2:
//			if(money - 1000 < 0) {
//				System.out.println("돈이 부족해요ㅜㅜ");
//				System.out.println("잔돈 : " + money);
//			}else
//			System.out.println("잔돈은" + (money - 1000) + "입니다");
//			break;
//		case 3:
//			if(money - 500 < 0) {
//				System.out.println("돈이 부족해요ㅜㅜ");
//				System.out.println("잔돈 : " + money);
//			}else
//			System.out.println("잔돈은" + (money - 500) + "입니다");
//			break;
//		default :
//			System.out.println("메뉴가 없습니다. 1 2 3번 중 선택하세요");
//			break;
//		}
		
		
		
		
			
		
	}

}
