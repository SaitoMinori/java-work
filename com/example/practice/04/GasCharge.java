import java.util.*;

public class GasCharge {
	public static void main(String[] args) {
		// 入力準備
		Scanner sc = new Scanner(System.in);
		// 使用量の入力
		System.out.print("使用量(m^3)を入力して下さい: ");
		int 使用量 = sc.nextInt();
		// 料金の計算
		int 料金;
		if (使用量 < 20) {
			料金 = 745 + 172 * 使用量;
		} else {
			料金 = 745 + 172 * 20 + 157 * (使用量 - 20);
		}
		// 結果出力
		System.out.println(料金 + "円");
	}

}
