import java.util.Scanner;

public class X���������� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);//�ֿܼ��� �Է¹ޱ�

		int n = sc.nextInt();//��� ������ �������� �Է¹޾� n������ ����
		int x = sc.nextInt();//���� ������ �Է¹޾� x������ ����

		for (int i = 0; i < n; i++) {//i�� n���� ���������� 1�� �����ϸ鼭 �ݺ�
			int n1 = sc.nextInt();//�Է¹޾� n1������ ����
			if (n1 < x) {//n1�� x���� ������ ��
				System.out.println(n1);//�۴ٸ� n1���
			}
		}

	}

}
