package javafestival5;

import java.util.Arrays;
import java.util.Scanner;

public class ex06채점프로그램 {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        int[] arr = new int[5];

		        // 정수 5개를 입력받아 배열에 저장
		        for (int i = 0; i < 5; i++) {
		            System.out.print((i+1) + "번째 정수 입력: ");
		            arr[i] = scanner.nextInt();
		        }

		        // 오름차순 정렬
		        Arrays.sort(arr);

		        // 정렬된 배열 출력
		        System.out.print("오름차순 정렬 결과: ");
		        for (int i = 0; i < 5; i++) {
		            System.out.print(arr[i] + " ");
		        }
		    }
		}
