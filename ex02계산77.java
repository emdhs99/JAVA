package javafestival3;

public class ex02계산77 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 1;
		
		for(int i = 77; i >= 1 ; i--) {
			sum += i*num;
			num++;
		}
		System.out.println(sum);

	}

}
