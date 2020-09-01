import java.util.Scanner;

public class 덧셈출력2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);//콘솔에서 입력받아 출력

		int x = sc.nextInt();//입력받은 값을 x변수에 저장

		for (int i = 1; i <= x; i++) {//i는 1부터 시작하여 x번만큼 증가하면서 반복
			int n1 = sc.nextInt();//입력받아 n1 변수에 저장
			int n2 = sc.nextInt();//입력받아 n2 변수에 저장

			System.out.println("Case #" + i + ": " + n1 + " + " + n2 
					+ " = " + (n1 + n2));//출력

		}

	}

}
