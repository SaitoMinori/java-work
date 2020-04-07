import java.util.*;

public class BMITable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("身長(cm)を入力して下さい: ");
		double 身長 = sc.nextDouble();
		System.out.print("体重(kg)を入力して下さい: ");
		double 体重 = sc.nextDouble();
		System.out.println("体重\tBMI");
		身長 = 身長 / 100; // cm -> m

		for (int i = -5; i <= 5; i++) {
			// BMIの計算
			double bmi = (体重 + i) / (身長 * 身長);
			System.out.println(体重 + i + "\t" + bmi);
		}
	}

}
