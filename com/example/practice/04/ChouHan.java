import java.util.*;

public class ChouHan {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// サイコロの目をランダムに設定
		int dice1 = (int) (Math.random() * 6) + 1; // サイコロ1の目
		int dice2 = (int) (Math.random() * 6) + 1; // サイコロ2の目
		int result = (dice1 + dice2) % 2; // 結果（丁なら0 半なら 1）
		// Math.random() * 6 → 0～5.9999999 の乱数
		// (int)(Math.random() * 6) → 0, 1, 2, 3, 4, 5 の乱数
		// (int)(Math.random() * 6) + 1 → 1, 2, 3, 4, 5, 6 の乱数

		// 人間の選択
		System.out.print("丁か半か？（丁なら0 半なら 1 を入力して下さい）: ");
		int x = sc.nextInt();
		// 結果出力
		System.out.print(dice1 + " " + dice2 + " の ");
		if (result == 0) {
			System.out.println("丁です");
		} else {
			System.out.println("半です");
		}
		// 勝ち負け判定
		if (x == result) {
			System.out.print("あなたの勝ちです\n");
		} else {
			System.out.print("あなたの負けです\n");
		}
	}

}
