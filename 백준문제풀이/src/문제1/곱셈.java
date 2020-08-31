package 문제1;

import java.util.Scanner;

public class 곱셈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a * (b % 10));//b의 세자리 수를 10으로 나누면 나머지가 1의 자리 숫자로 나온다.
		System.out.println(a * ((b % 100)/ 10));//b의 세자리 수를 100으로 나눈 나머지에서 다시 나누기 10을 하면 10의 자리 숫자가 나온다.
		System.out.println(a * (b / 100));//b에 나누기 100을 하면 백의 자리 숫자가 나온다.

		System.out.println(a * b);//곱셈출력

	}

}
