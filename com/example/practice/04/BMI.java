import java.util.*;

public class BMI {
	public static void main(String args[]) {
		// 入力準備
		Scanner sc = new Scanner(System.in);
		// 身長の入力
		System.out.print("身長(cm)を入力して下さい: ");
		double 身長 = sc.nextDouble();
		// 体重の入力
		System.out.print("体重(kg)を入力して下さい: ");
		double 体重 = sc.nextDouble();
		// BMIの計算
		身長 = 身長 / 100; // cm -> m
		double bmi = 体重 / (身長 * 身長);
		// 結果出力
		System.out.println("BMI = " + bmi);
		// 判定
		if (bmi >= 25) {
			System.out.println("肥満");
		} else if (bmi >= 18.5 && bmi < 25) {
			System.out.println("標準");
		} else {
			System.out.println("低体重");
		}
	}
}
