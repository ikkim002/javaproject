import java.util.Scanner;

public class Ex06_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int a = 0;
		int b;
		int c; // �Է� ���� ���� ��
		for (b = 1; b <= c; b = b++) {
			System.out.printf("���� �Է��Ͻÿ� :");
			a = s.nextInt();
			a += b;
		}
		System.out.printf("�� :%d\n",c,a);

	}

}
