import java.util.*;

public class Kazuate {
	public static void main(String args[]) {
		// 入力準備
		Scanner sc = new Scanner(System.in);
		// コンピュータが数を選ぶ
		int a = (int) (Math.random() * 20) + 1;
		// カウンターの初期化
		int count = 1;
		// 数を入力
		System.out.print("当ててごらん：");
		int x = sc.nextInt();
		// 当たるまで繰り返し
		while (x != a) {
			// はずれのメッセージ
			System.out.println("違うよーん");
			// ヒントの表示
			if (x > a) {
				System.out.println("大きすぎ！");
			} else {
				System.out.println("小さすぎ！");
			}
			// カウントを1増やす
			count++;
			// 数を入力
			System.out.print("当ててごらん：");
			x = sc.nextInt();
		}
		// 最後のメッセージ
		System.out.println("当たりです");
		System.out.println(count + "回目で当てました");
		if (count <= 4) {
			System.out.println("すばらしい!");
		}

	}

}
