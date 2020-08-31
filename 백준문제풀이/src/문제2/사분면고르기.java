package 문제2;

import java.util.Scanner;

public class 사분면고르기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();//정수로 변수 저장
		int y = sc.nextInt();//정수로 변수 저장

		if (x > 0 && y > 0) {//x와 y가 0보다 큰지 비교
			System.out.println("1"); //조건이 만족하면 출력
		} else if (x < 0 && y > 0) {//x가 0보다 작은지와 y가 0보다 큰지 비교
			System.out.println("2");//조건이 만족하면 출력
		} else if (x < 0 && y < 0) {//x가 0보다 작고 y가 0보다 작은지 비교
			System.out.println("3");//조건이 만족하면 출력
		} else if (x > 0 && y < 0) {//x가 0보다 크고 y가 0보다 작은지 비교
			System.out.println("4");//조건이 만족하면 출력
		}

	}

}
