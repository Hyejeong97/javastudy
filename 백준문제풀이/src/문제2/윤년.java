package ����2;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();// �Է¹ޱ�

		if ((year % 4) == 0 && (year % 100) != 0) {
			// year�� 4�� ���� �������� 0�̸鼭 year�� 100���� ���� �������� 0�� �ƴ��� ��
			System.out.println("1");
		} else if ((year % 400) == 0) {// year�� 400���� ���� �������� 0���� ��
			System.out.println("1");
		} else {// �ٸ� ��� 0���
			System.out.println("0");
		}

	}

}
