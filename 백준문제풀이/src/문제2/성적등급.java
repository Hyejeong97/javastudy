package 문제2;

import java.util.Scanner;

public class 성적등급 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int score = sc.nextInt();//입력받기
		
		if(score >=90 && score <= 100) {//score가 90~100인지 비교
			System.out.println("A");
		}else if(score>=80 && score<=89 ) {//score가 80~89인지 비교
			System.out.println("B");
		}else if(score>=70 && score<=79) {//score가 70~79인지 비교
			System.out.println("C");
		}else if(score>=60 && score<=69) {//score가 60~69인지 비교
			System.out.println("D");
		}else {//나머지
			System.out.println("F");
		}
		
	}

}
