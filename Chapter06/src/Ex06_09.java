
public class Ex06_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 500���� ~ 1000������ Ȧ���� ��

		int a = 0;
		int b;

		for (b = 500; b <= 1000; b = b + 2) {

			a += b;
		}
		System.out.printf("500~1000������ Ȧ���� ��: %d", a);
	}

}