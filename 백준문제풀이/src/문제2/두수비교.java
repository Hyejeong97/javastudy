package ����2;

import java.util.Scanner;

public class �μ��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();//�Է¹ޱ�
		int b = sc.nextInt();//�Է¹ޱ�

		if (a > b) {//a�� b���� ū�� ��
			System.out.println(">");
		}
		if (a < b) {//a�� b���� ������ ��
			System.out.println("<");
		}
		if (a == b) {//a�� b�� ������ ��
			System.out.println("==");
		}

	}

}
