import java.util.Scanner;

public class º°Âï±â2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			for (int j = 1; j < (x - i); j++) {

				System.out.print(" ");
			}
			for (int k = x - i; k <= x; k++) {

				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
