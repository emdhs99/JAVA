package 산술연산자;

import java.util.Scanner;

public class 산술연산자과제 {

	public static void main(String[] args) {

		// 초를 입력 받아 [시, 분, 초] 형태로 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력 : ");
		int totalSecond = sc.nextInt();
		System.out.print(totalSecond / (60*60*24) + "일 ");
		System.out.print(totalSecond % (60*60*24) / (60*60) + "시 ");
		System.out.print(totalSecond % (60*60*24) % (60*60) /60 + "분 ");
		System.out.print(totalSecond % (60*60*24) % (60*60) % 60 + "초");
		
		
		
	}

}
