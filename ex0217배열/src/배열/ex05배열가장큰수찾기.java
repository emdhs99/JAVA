package 배열;

import java.util.Arrays;
import java.util.Random;

public class ex05배열가장큰수찾기 {

	public static void main(String[] args) {
		Random ran = new Random();
		int [] array = new int[5];
		
		int num = 0;
		for(int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(10)+1;
			if(array[i]>num) {
				num = array[i];
			}
		}
		System.out.println("배열 안에 있는 값 : " + Arrays.toString(array));
		System.out.println("가장 큰 값은 " + num + "입니다." );
		
		
		
		
	}

}
