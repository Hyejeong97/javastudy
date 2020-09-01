import java.util.Scanner;

public class N찍기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//콘솔에서 입력받기
		
		int x = sc.nextInt();//입력받아 x에 저장
		
		for (int i = 1; i <= x; i++) {//x만큼 i가 1씩 증가하여 반복
			System.out.println(i);//i 출력
		}

	}

}
