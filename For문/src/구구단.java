import java.util.Scanner;

public class ������ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);// �ֿܼ��� �Է¹ޱ�

		int x = sc.nextInt();// �Է¹��� �� x������ ����

		for (int i = 1; i <= 9; i++) {// i���� 10�� �ݺ�

			System.out.println(x + " * " + i + " = " + (x * i));
			// �Է¹��� x�� ���, i 10�� �ݺ� �����ϸ鼭 ���
		}

	}
}
