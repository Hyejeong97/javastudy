import java.util.Scanner;

public class 덧셈여러번반복 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 콘솔창에서 입력받기

		int x = sc.nextInt();//입력값 x변수에 저장

		for (int i = 0; i < x; i++) {//i가 x보다 작을때까지 증가하여 반복

			int n1 = sc.nextInt();//x번 만큼 입력받아 n1변수에 저장
			int n2 = sc.nextInt();//x번 만큼 입력받아 n2변수에 저장

			System.out.println(n1 + n2);//n1과 n2 더해서 출력

		}

	}

}
