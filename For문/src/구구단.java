import java.util.Scanner;

public class 구구단 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);// 콘솔에서 입력받기

		int x = sc.nextInt();// 입력받은 값 x변수에 저장

		for (int i = 1; i <= 9; i++) {// i값을 10번 반복

			System.out.println(x + " * " + i + " = " + (x * i));
			// 입력받은 x값 출력, i 10번 반복 증가하면서 출력
		}

	}
}
