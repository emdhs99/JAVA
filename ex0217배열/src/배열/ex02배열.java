package 배열;

import java.util.Random;
import java.util.Scanner;

public class ex02배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("정수입력 : ");
		int num3 = sc.nextInt();
		int[] array = new int[num3];
		// 1. 정수형 데이터 5개를 보관할 수 있는 array 배열 생성
		// 2. 배열의 모든 인덱스 안에 있는 데이터값 랜덤한 값으로 변경(1~10)
		// 3. 배열 안에 있는 모든 값을 출력하기
//		array[1] = ran.nextInt(10);
//		System.out.println(array[1]);
		int num1 = array.length;
		System.out.println(num1);
		
		//배열의 크기를 가져오는 방법 ---> 배열이름.length
		for (int i = 0; i < array.length; i++) {
			int num = ran.nextInt(10) + 1;
			array[i] = num;
			System.out.println(array[i]);
		}

	}

}
