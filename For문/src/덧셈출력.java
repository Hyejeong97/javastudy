import java.util.Scanner;

public class ������� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);// �ֿܼ��� �Է¹ޱ�

		int x = sc.nextInt();// �Է¹޾� x������ ����

		for (int i = 1; i <= x; i++) {// i�� x����ŭ 1���� �����ϸ鼭 �ݺ�
			int n1 = sc.nextInt();// �Է¹޾� n1������ ����
			int n2 = sc.nextInt();// �Է¹޾� n2������ ����

			System.out.println("Case #" + i + ": " + (n1 + n2));
			// ���
		}

	}

}
