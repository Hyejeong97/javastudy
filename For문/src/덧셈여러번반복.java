import java.util.Scanner;

public class �����������ݺ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// �ܼ�â���� �Է¹ޱ�

		int x = sc.nextInt();//�Է°� x������ ����

		for (int i = 0; i < x; i++) {//i�� x���� ���������� �����Ͽ� �ݺ�

			int n1 = sc.nextInt();//x�� ��ŭ �Է¹޾� n1������ ����
			int n2 = sc.nextInt();//x�� ��ŭ �Է¹޾� n2������ ����

			System.out.println(n1 + n2);//n1�� n2 ���ؼ� ���

		}

	}

}
