import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int targetSales = 1000;
		int mySales;
		int bonus;
		String result;

		Scanner input = new Scanner(System.in);

		System.out.printf("실적을 입력하세요. (단위 : 만원)");
		mySales = input.nextInt();

		if (mySales >= targetSales) {
			result = "실적을 달성하였습니다.";
			bonus = (mySales - targetSales) / 10;
		} else {
			result = "실적 달성을 실패하였습니다.";
			bonus = 0;
		}
		System.out.println(result + "\n" + "보너스 : " + bonus);

	}

}
