package 배열;

import java.util.Random;
import java.util.Scanner;

public class ex03홀수찾기 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("array 몇개로 할까? : ");
		int num2 = sc.nextInt();
		int[] array = new int[num2];
		System.out.println("그래 좋아!");
		
		System.out.print("array에 들어있는 홀수는 " );
		
		int num1 = 0;
		for(int i = 0; i < array.length;i++) {
			array[i] = ran.nextInt(100)+1;
			
			if(array[i] % 2 == 1) {
				System.out.print(array[i] + " ");
				num1++;
			} else ;
		}
		System.out.println("이며, ");
		System.out.println("총" + num1 + "개 입니다." );
		
		
		
		
		
	}

}
