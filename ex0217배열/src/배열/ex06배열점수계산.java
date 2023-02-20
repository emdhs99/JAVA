package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class ex06배열점수계산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		
		
		int max = 0;
		int min = 1000000000;
		int a = 0;
		for(int i = 0; i < array.length;i++) {
			System.out.print(i + 1 +"번째 입력 >> ");
			int num = sc.nextInt();
			array[i] = num;
			
			if(array[i]>max) {
				max = array[i];
			} else if (array[i]<min){
				min = array[i];
			}
			a += array[i];
		}
		System.out.println("입력된 점수 : " + Arrays.toString(array));
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		System.out.println("총합 : " + a);
		System.out.println("평균 : " + (double)a / 5);
	}

}
