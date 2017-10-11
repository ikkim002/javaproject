import java.util.Scanner;

public class Ex06_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int a = 0;
		int b;
		int c; // 입력 받을 최종 값
		for (b = 1; b <= c; b = b++) {
			System.out.printf("값을 입력하시오 :");
			a = s.nextInt();
			a += b;
		}
		System.out.printf("합 :%d\n",c,a);

	}

}
