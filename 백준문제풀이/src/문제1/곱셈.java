package ����1;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a * (b % 10));//b�� ���ڸ� ���� 10���� ������ �������� 1�� �ڸ� ���ڷ� ���´�.
		System.out.println(a * ((b % 100)/ 10));//b�� ���ڸ� ���� 100���� ���� ���������� �ٽ� ������ 10�� �ϸ� 10�� �ڸ� ���ڰ� ���´�.
		System.out.println(a * (b / 100));//b�� ������ 100�� �ϸ� ���� �ڸ� ���ڰ� ���´�.

		System.out.println(a * b);//�������

	}

}
