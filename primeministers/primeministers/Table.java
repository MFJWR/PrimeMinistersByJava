package primeministers;

import java.awt.image.BufferedImage;

// import java.lang.String;
import java.util.ArrayList;

/**
 * 表：総理大臣の情報テーブル。
 */
public class Table extends Object {
	/**
	 * ここを作成してください。 まず、次のページを参照しながら、スケルトン（スタブ）を作ることから始めましょう。
	 * http://www.cc.kyoto-
	 * su.ac.jp/~atsushi/Programs/CSV2HTML/PrimeMinistersJavaDoc/index.html
	 */

	/**
	 * 属性リストを記憶するフィールド。
	 */
	private Attributes attributes;

	/**
	 * 画像群を記憶するフィールド。
	 */
	private ArrayList<BufferedImage> images;

	/**
	 * サムネイル画像群を記憶するフィールド。
	 */
	private ArrayList<BufferedImage> thumbnails;

	/**
	 * タプル群を記憶するフィールド。
	 */
	private ArrayList<Tuple> tuples;

	/**
	 * テーブルのコンストラクタ
	 */
	public Table() {
		// attributes = new Attributes();

		tuples = new ArrayList<Tuple>();

	}

	/**
	 * タプルを追加する。
	 */
	public void add(Tuple aTuple) {
		tuples.add(aTuple);
	}

	/**
	 * 属性リストを応答する。
	 */
	public Attributes attributes() {
		return attributes;
	}

	/**
	 * 属性リストを設定する。
	 */
	public void attributes(Attributes instanceOfAttributes) {
		attributes = instanceOfAttributes;
	}

	/**
	 * 画像群を応答する。
	 */
	public ArrayList<BufferedImage> images() {
		return images;
	}

	/**
	 * 画像またはサムネイル画像の文字列を受け取って当該画像を応答する。
	 */
	/*
	 * private BufferedImage picture(String aString) { int index =
	 * aString.indexOf("/"); if (aString.substring(0,index).equals("images")) {
	 * return images.get(images.indexOf(aString)); } else if
	 * (aString.substring(0,index).equals("thumbnails")) { return
	 * thumbnails.get(thumbnails.indexOf(aString)); } }
	 */

	/**
	 * サムネイル画像群を応答する。
	 */
	public ArrayList<BufferedImage> thumbnails() {
		return thumbnails;
	}

	/**
	 * 自分自身を文字列にして、それを応答する。
	 */
	public String toString() {
		// Overrides: toString in class java.lang.Object
		return "";
	}

	/**
	 * タプル群を応答する。
	 */
	public ArrayList<Tuple> tuples() {
		return tuples;
	}
}
