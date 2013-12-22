package primeministers;

import java.io.File;
import java.util.ArrayList;

/**
 * 入出力：リーダ・ダウンローダ・ライタを抽象する。
 */
public abstract class IO extends Object {
	/**
	 * ここを作成してください。 まず、次のページを参照しながら、スケルトン（スタブ）を作ることから始めましょう。
	 * http://www.cc.kyoto-
	 * su.ac.jp/~atsushi/Programs/CSV2HTML/PrimeMinistersJavaDoc/index.html
	 */
	// フィールド//
	protected Table table;

	// コンストラクタ//
	public IO() {
	}

	// メソッド//
	public static void deleteFileOrDirectory(File aFile) {
		aFile.delete();
	}

	public static File directoryOfPages() {
		File aDirectory = new File("/Desktop/SouriDaijin");
		if (aDirectory.exists())
			aDirectory.delete();
		aDirectory.mkdir();

		return aDirectory;
	}

	public static String encodingSymbol() {
	}

	public static ArrayList<String> readTextFromFile(File aFile) {
	}

	public static ArrayList<String> readTextFromFile(String fileString) {
	}

	public static ArrayList<String> readTextFromURL(String urlString) {
	}

	public static ArrayList<String> readTextFromURL(URL aURL) {
	}

	public static ArrayList<String> splitString(String string, String separators) {
	}

	public Table table() {
	}

	public static void writeText(ArrayList<String> aCollection, File aFile) {
	}

	public static void writeText(ArrayList<String> aCollection,
			String fileString) {
	}

}
