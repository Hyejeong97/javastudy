package ����2;

import java.util.Scanner;

public class �˶��ð� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();// �Է� �޾Ƽ� ���� ���� h�� ����
		int m = sc.nextInt();// �Է� �޾Ƽ� ���� ���� m�� ����

		if (m < 45) {// m �Է°��� 45���� ������ ��
			h--; // 45���� �۴ٸ� 1�� ����
			int mm1 = 60 - (45 - m);//
			//�ѽð��� 60���̹Ƿ� 45���� �� ���� �� ����
			if (h < 0) {//h�� 0�̸����� ��
				h = 23;//0�̸��̶�� 23���� h������ ����
				
			}
			System.out.println(h + " " + mm1);
			//���
			
		} else {
			System.out.println(h + " " + (m - 45));
		}

	}

}
