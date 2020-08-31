package 문제1;

import java.util.Scanner;

public class 나머지구하기 {

	public static void main(String[] args) {
		// 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C,
		// 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();// 입력받기
		int b = sc.nextInt();// 입력받기
		int c = sc.nextInt();// 입력받기

		System.out.println((a + b) % c);
		System.out.println(((a % c) + (b % c)) % c);
		System.out.println((a * b) % c);
		System.out.println(((a % c) * (b % c)) % c);

	}

}
