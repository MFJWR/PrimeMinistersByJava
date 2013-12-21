package primeministers;

import javax.swing.JOptionPane;

/**
 * トランスレータ：総理大臣のCSVファイルをHTMLページへと変換するプログラム。
 */
public class Translator extends Object {
	/**
	 * トランスレータのフィールド
	 */

	/**
	 * CSVに由来するテーブルを記憶するフィールド
	 */
	private Table inputTable;

	/**
	 * HTMLに由来するテーブルを記憶するフィールド
	 */
	private Table outputTable;

	/**
	 * トランスレータのコンストラクタ。
	 */
	public Translator() {
		super();
		return;
	}

	/**
	 * トランスレータのメソッド
	 */

	/**
	 * 在位日数を計算して、それを文字列にして応答する
	 */
	public String computeNumberOfDays(java.lang.String periodString) {
		return "";
	}

	/**
	 * サムネイル画像から画像へ飛ぶためのHTML文字列を作成して、それを応答する
	 */
	public String computeStringOfImage(String aString, Tuple aTuple, int no) {
		return "";
	}

	/**
	 * 総理大臣のCSVファイルをHTMLページへ変換する。
	 */
	public void perform() {
		/**
		 * ここを作成してください。 まず、次のページを参照しながら、スケルトン（スタブ）を作ることから始めましょう。
		 * http://www.cc.kyoto
		 * -su.ac.jp/~atsushi/Programs/CSV2HTML/PrimeMinistersJavaDoc/index.html
		 */
		this.inputTable = new Downloader().table();
		String aString = "総理大臣のCSVファイルからHTMLページへの変換を無事に完了しました。\n";
		JOptionPane.showMessageDialog(null, aString, "報告",
				JOptionPane.PLAIN_MESSAGE);
		return;
	}

	/**
	 * 総理大臣のCSVファイルを基にしたテーブルから、HTMLページを基にするテーブルに変換して、それを応答する
	 */
	public Table table(Table aTable) {
		return outputTable;
	}
}
