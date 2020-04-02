package com.example.demo;

public class Throw {

	public static void main(String[] args) {

		int result = 100;
		try {
			// result = div(5, 1);
			result = div(5, 0);
		} catch (ArithmeticException e) {
			System.out.println("０割のエラー：[ArithmeticException]");
			// logger.log(Level.FINE, e.getMessage(), e);
			System.out.println(e);
			result = 10;
		} catch (Exception e) {
			System.out.println("例外が発生しました。");
			System.out.println(e);
		}
		System.out.println("エラー" + result);

		for (int number = 1; number <= 10; number++) {
			result += number;
		}
		System.out.println("戻り値 = " + result);

	}

	public static int div(int num1, int num2) throws Exception {
		int result = 0;
		result = num1 / num2;
		System.out.println("↑ここでエラー");
		return result;
	}
	// public static int div(int num1, int num2) throws ArithmeticException {
	// int result = 0;
	// try {
	// result = num1 / num2;
	// } catch (Exception e) {
	// System.out.println("ArithmeticException が発生しました。");
	// System.out.println(e);
	// }
	// System.out.println("結果返すよ！");
	// return result;
	// }

}
