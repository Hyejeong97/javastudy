import java.util.Scanner;

public class �� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();//�ֿܼ��� �Է¹޾� x������ ����
		int sum = 0;//�ʱ�ȭ
		
		for (int i = 0; i <= x; i++) {//i�� x������ �����Ͽ� �ݺ�
				
			sum += i;//i�� 1�������Ͽ� ���� �� sum ������ ����
			
		}
		System.out.println(sum);//sum���
	

	}

}
