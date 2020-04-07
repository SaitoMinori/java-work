import java.util.*;

public class Sum10 {
	public static void main(String args[]) {
		int s = 0;
		int i = 1;
		while (i <= 100) {
			s = s + i;
			System.out.println("i=" + i + " s=" + s);
			i = i + 1;
		}
		System.out.println("1から100までの和は" + s + "です");
	}
}
