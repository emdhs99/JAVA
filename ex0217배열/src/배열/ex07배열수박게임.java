package 배열;

import java.util.Scanner;

public class ex07배열수박게임 {

	public static void main(String[] args) {
			char[] array = {'수' , '박'};
			
			Scanner sc = new Scanner(System.in);
			System.out.println("====수박 게임 start~!====");
			System.out.print("숫자르 입력하세요 >> ");
			int num = sc.nextInt();
		
		
		for(int i = 0; i < num ; i++) {
			System.out.print(array[i % 2]);
		}
	}

}

