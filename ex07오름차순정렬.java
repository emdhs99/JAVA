package festival5일차;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ex07오름차순정렬 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] array = new Integer[5];
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.print(i+1 + "번째 수 입력 : ");
			int num = sc.nextInt();
			array[i] = num;
			
		}
		System.out.println("정렬 후");
//		Arrays.sort(array, Collections.reverseOrder());
		Arrays.sort(array);	
		for(int i = 0; i < array.length; i++) {
		System.out.print(array[i] + " ");
		}
		
	}

}
