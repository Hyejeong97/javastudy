package ����2;

import java.util.Scanner;

public class ��и���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();//������ ���� ����
		int y = sc.nextInt();//������ ���� ����

		if (x > 0 && y > 0) {//x�� y�� 0���� ū�� ��
			System.out.println("1"); //������ �����ϸ� ���
		} else if (x < 0 && y > 0) {//x�� 0���� �������� y�� 0���� ū�� ��
			System.out.println("2");//������ �����ϸ� ���
		} else if (x < 0 && y < 0) {//x�� 0���� �۰� y�� 0���� ������ ��
			System.out.println("3");//������ �����ϸ� ���
		} else if (x > 0 && y < 0) {//x�� 0���� ũ�� y�� 0���� ������ ��
			System.out.println("4");//������ �����ϸ� ���
		}

	}

}
