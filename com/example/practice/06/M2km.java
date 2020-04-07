import java.util.*;

public class M2km {
	public static void main(String args[]) {
		System.out.println("mph\tkm/h");
		for (int m = 80; m <= 100; m++) {
			double k = m * 1.609;
			System.out.println(m + "\t" + k);
		}
	}
}
