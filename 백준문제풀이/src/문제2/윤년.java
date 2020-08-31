package 문제2;

import java.util.Scanner;

public class 윤년 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();// 입력받기

		if ((year % 4) == 0 && (year % 100) != 0) {
			// year을 4로 나눈 나머지가 0이면서 year을 100으로 나눈 나머지가 0이 아닌지 비교
			System.out.println("1");
		} else if ((year % 400) == 0) {// year을 400으로 나눈 나머지가 0인지 비교
			System.out.println("1");
		} else {// 다른 경우 0출력
			System.out.println("0");
		}

	}

}
