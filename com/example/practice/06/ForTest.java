import java.util.*;

public class ForTest {
	public static void main(String args[]) {
		System.out.println("例題2 1");
		for (int i = 10; i <= 20; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println("例題2 2");
		for (int i = 10; i <= 50; i = i + 5) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println("例題2 3");
		for (int i = 100; i >= 0; i = i - 10) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println("例題2 4");
		for (int i = 1; i <= 1000000; i = i * 10) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println("例題2 5");
		for (int i = 1000000; i >= 1; i = i / 10) {
			System.out.print(i + " ");
		}
	}
}
