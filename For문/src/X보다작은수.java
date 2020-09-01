import java.util.Scanner;

public class X보다작은수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);//콘솔에서 입력받기

		int n = sc.nextInt();//몇개의 수열을 생성할지 입력받아 n변수에 저장
		int x = sc.nextInt();//비교할 정수를 입력받아 x변수에 저장

		for (int i = 0; i < n; i++) {//i가 n보다 작을때까지 1씩 증가하면서 반복
			int n1 = sc.nextInt();//입력받아 n1변수에 저장
			if (n1 < x) {//n1이 x보다 작은지 비교
				System.out.println(n1);//작다면 n1출력
			}
		}

	}

}
