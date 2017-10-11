import java.util.Scanner;

public class Ex06_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int a = 0;
		int b;
		int c, d, e;

		System.out.printf("시작 값:");
		c = s.nextInt();

		System.out.printf("끝 값:");
		d = s.nextInt();

		System.out.printf("증가 값:");
		e = s.nextInt();

		for (b = c; b <= d; b = b + e) {
			a += b;
			System.out.printf("%d에서 %d까지 %d씩 증가한 값의 합%d", c, d, e);
		}
	}

}
