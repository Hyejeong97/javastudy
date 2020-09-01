import java.util.Scanner;

public class N감소찍기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);// 콘솔에서 입력받기

		int x = sc.nextInt();// 입력받아 x변수에 저장

		for (int i = x; i > 0; i--) {
			// i는 x부터 시작하고 0보다 클때까지만 감소하면서 반복
			System.out.println(i);// 출력
		}

	}

}
