package primeministers;

import java.io.File;

/**
 * リーダ：総理大臣の情報を記したCSVファイルを読み込んでテーブルに仕立て上げる。
 */
public class Reader extends IO {
	/**
	 * ここを作成してください。 まず、次のページを参照しながら、スケルトン（スタブ）を作ることから始めましょう。
	 * http://www.cc.kyoto-
	 * su.ac.jp/~atsushi/Programs/CSV2HTML/PrimeMinistersJavaDoc/index.html
	 */

	// テーブル//
	/**
	 * 総理大臣の情報を記したCSVファイルを記憶するフィールド。
	 */
	private File filename;

	// コンストラクタ//
	/**
	 * リーダのコンストラクタ
	 */
	public Reader() {
	}

	// メソッド//
	/**
	 * ダウンロードしたCSVファイルのローカルなファイルを応答するクラスメソッド。
	 */
	// public static File filenameOfCSV() {}

	/**
	 * ダウンロードしたCSVファイルを応答する。
	 */
	public File filename() {
		return this.filename;
	}

	/**
	 * ダウンロードしたCSVファイルを読み込んでテーブルを応答する。
	 */
	public Table table() {
		this.filename = new File(System.getProperty("user.home")
				+ "/Desktop/SouriDaijin/PrimeMinisters.csv");
		Table inputTable = new Table();
		Attributes anAttributes = new Attributes("input");
		inputTable.attributes(anAttributes);
		for (String row : super.readTextFromFile(this.filename)) {
			Tuple aTuple = new Tuple(anAttributes, super.splitString(row, ","));
			inputTable.add(aTuple);
		}
		return inputTable;
	}
}
