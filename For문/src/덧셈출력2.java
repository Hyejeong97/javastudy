import java.util.Scanner;

public class �������2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);//�ֿܼ��� �Է¹޾� ���

		int x = sc.nextInt();//�Է¹��� ���� x������ ����

		for (int i = 1; i <= x; i++) {//i�� 1���� �����Ͽ� x����ŭ �����ϸ鼭 �ݺ�
			int n1 = sc.nextInt();//�Է¹޾� n1 ������ ����
			int n2 = sc.nextInt();//�Է¹޾� n2 ������ ����

			System.out.println("Case #" + i + ": " + n1 + " + " + n2 
					+ " = " + (n1 + n2));//���

		}

	}

}
