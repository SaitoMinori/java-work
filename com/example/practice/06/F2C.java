import java.util.*;

public class F2C {
	public static void main(String[] args) {
		System.out.println("華氏\t摂氏");
		for (int f = 0; f <= 100; f = f + 5) {
			double c = (f - 32) / 1.8;
			System.out.println(f + "\t" + c);
		}
	}

}
