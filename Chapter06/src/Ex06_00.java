import java.util.Scanner;

public class Ex06_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int a = 0;
		int b;
		int c, d, e;

		System.out.printf("���� ��:");
		c = s.nextInt();

		System.out.printf("�� ��:");
		d = s.nextInt();

		System.out.printf("���� ��:");
		e = s.nextInt();

		for (b = c; b <= d; b = b + e) {
			a += b;
			System.out.printf("%d���� %d���� %d�� ������ ���� ��%d", c, d, e);
		}
	}

}
