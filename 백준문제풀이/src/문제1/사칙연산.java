package 문제1;

import java.util.Scanner;

public class 사칙연산 {

	public static void main(String[] args) {
		// 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();//입력받기
		int b = sc.nextInt();//입력받기

		System.out.println(a + b);//덧셈
		System.out.println(a - b);//뺄셈
		System.out.println(a * b);//곱셈
		System.out.println(a / b);//나눗셈
		System.out.println(a % b);//나머지 구하기

	}

}
