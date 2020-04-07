import java.util.*;

public class LeapYear {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("西暦年を入力して下さい: ");
		int year = sc.nextInt();
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			System.out.println("閏年です");
		} else {
			System.out.println("閏年ではありません");
		}
	}
}
