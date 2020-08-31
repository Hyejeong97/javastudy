package 문제2;

import java.util.Scanner;

public class 알람시계 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();// 입력 받아서 정수 변수 h에 저장
		int m = sc.nextInt();// 입력 받아서 정수 변수 m에 저장

		if (m < 45) {// m 입력값이 45보다 작은지 비교
			h--; // 45보다 작다면 1을 감소
			int mm1 = 60 - (45 - m);//
			//한시간은 60분이므로 45에서 뺀 값을 또 뺀다
			if (h < 0) {//h가 0미만인지 비교
				h = 23;//0미만이라면 23으로 h변수에 저장
				
			}
			System.out.println(h + " " + mm1);
			//출력
			
		} else {
			System.out.println(h + " " + (m - 45));
		}

	}

}
