import java.util.Scanner;

public class 별찍기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);//콘솔에서 입력받기

		int x = sc.nextInt();//입력받아 x변수에 저장

		for (int i = 0; i < x; i++) {//i를 0부터 시작하여 x번 만큼 증가하면서 반복
			for (int j = 0; j <= i; j++) {
				//j는 0부터 시작하여 i랑 작거나 같으면 증가하면서 반복
				System.out.print("*");//출력

			}
			System.out.println("");//행을 바꿔주기 위한 공백
		}

	}

}
