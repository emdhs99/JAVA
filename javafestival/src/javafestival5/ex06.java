package javafestival5;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 채점하기 ====");
		System.out.print("");
		String num = sc.nextLine();
		
//        String answers = "oooxoo"; // 학생이 제출한 답안
        int score = 0; // 총점 초기화
        int consecutive = 0; // 연속된 'o' 개수 초기화

        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == 'o') {
                consecutive++; // 'o'가 연속으로 나오는 경우 연속된 개수를 증가
                score += consecutive; // 누적 점수 계산
            } else {
                consecutive = 0; // 'o'가 아닌 경우 연속된 개수 초기화
            }
        }

        System.out.println(score); // 총점 출력
    }
}