import java.util.Scanner;

public class ����� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);//�ֿܼ��� �Է¹ޱ�

		int x = sc.nextInt();//�Է¹޾� x������ ����

		for (int i = 0; i < x; i++) {//i�� 0���� �����Ͽ� x�� ��ŭ �����ϸ鼭 �ݺ�
			for (int j = 0; j <= i; j++) {
				//j�� 0���� �����Ͽ� i�� �۰ų� ������ �����ϸ鼭 �ݺ�
				System.out.print("*");//���

			}
			System.out.println("");//���� �ٲ��ֱ� ���� ����
		}

	}

}
