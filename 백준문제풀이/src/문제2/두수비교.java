package 문제2;

import java.util.Scanner;

public class 두수비교 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();//입력받기
		int b = sc.nextInt();//입력받기

		if (a > b) {//a가 b보다 큰지 비교
			System.out.println(">");
		}
		if (a < b) {//a가 b보다 작은지 비교
			System.out.println("<");
		}
		if (a == b) {//a와 b가 같은지 비교
			System.out.println("==");
		}

	}

}
