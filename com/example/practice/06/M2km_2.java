import java.util.*;

public class M2km_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("開始球速を入力してください: ");
		int start = sc.nextInt();
		System.out.print("終了球速を入力してください: ");
		int end = sc.nextInt();

		System.out.println("mph\tkm/h");
		for (int m = start; m <= end; m++) {
			double k = m * 1.609;
			System.out.println(m + "\t" + k);
		}
	}

}
