package ����2;

import java.util.Scanner;

public class ������� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int score = sc.nextInt();//�Է¹ޱ�
		
		if(score >=90 && score <= 100) {//score�� 90~100���� ��
			System.out.println("A");
		}else if(score>=80 && score<=89 ) {//score�� 80~89���� ��
			System.out.println("B");
		}else if(score>=70 && score<=79) {//score�� 70~79���� ��
			System.out.println("C");
		}else if(score>=60 && score<=69) {//score�� 60~69���� ��
			System.out.println("D");
		}else {//������
			System.out.println("F");
		}
		
	}

}
