package ����1;

import java.util.Scanner;

public class ���������ϱ� {

	public static void main(String[] args) {
		// ù° �ٿ� (A+B)%C, ��° �ٿ� ((A%C) + (B%C))%C,
		// ��° �ٿ� (A��B)%C, ��° �ٿ� ((A%C) �� (B%C))%C�� ����Ѵ�.

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();// �Է¹ޱ�
		int b = sc.nextInt();// �Է¹ޱ�
		int c = sc.nextInt();// �Է¹ޱ�

		System.out.println((a + b) % c);
		System.out.println(((a % c) + (b % c)) % c);
		System.out.println((a * b) % c);
		System.out.println(((a % c) * (b % c)) % c);

	}

}
