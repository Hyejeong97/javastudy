import java.util.Scanner;

public class 합 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();//콘솔에서 입력받아 x변수에 저장
		int sum = 0;//초기화
		
		for (int i = 0; i <= x; i++) {//i를 x번까지 증가하여 반복
				
			sum += i;//i를 1씩증가하여 더한 뒤 sum 변수에 저장
			
		}
		System.out.println(sum);//sum출력
	

	}

}
