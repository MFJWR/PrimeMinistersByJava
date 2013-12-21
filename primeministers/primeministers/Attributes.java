package primeministers;

import java.util.ArrayList;
// import java.lang.String;

/**
 * 属性群：総理大臣の情報テーブルを入出力する際の属性情報を記憶。
 */
public class Attributes extends Object {
	/**
	 * ここを作成してください。
	 * まず、次のページを参照しながら、スケルトン（スタブ）を作ることから始めましょう。
	 * http://www.cc.kyoto-su.ac.jp/~atsushi/Programs/CSV2HTML/PrimeMinistersJavaDoc/index.html
	 */
	
	/**
	 * 属性リストのキー群を記憶するフィールド。
	 */
	private ArrayList<String> keys;
	
	/**
	 * 属性リストの名前群を記憶するフィールド。
	 */
	private ArrayList<String> names;

	
	/**
	 * 入力用("input")または出力用("output")で属性リストを作成するコンストラクタ。
	 */
	public Attributes(String aString) {
		keys = new ArrayList<String>();
		names = new ArrayList<String>();
		
		int i=0;
		while(i<10){
			keys.add(Integer.toString(i));
			i++;
		}
		
		if (aString.equals("input")) {
			names.add("no");
			names.add("order");
			names.add("name");
			names.add("kana");
			names.add("period");
			names.add("school");
			names.add("party");
			names.add("place");
			names.add("image");
			names.add("thumbnail");
		}
		else if (aString.equals("output")) {
			names.add("no");
			names.add("order");
			names.add("name");
			names.add("kana");
			names.add("period");
			names.add("days");
			names.add("school");
			names.add("party");
			names.add("place");
			names.add("image");
		}
	}
	

	/**
	 * 指定されたインデックスに対応する名前を応答する。名前が無いときはキーを応答する。
	 */
	protected String at(int index) {
		if(names.get(index) == null) {
			return keys.get(index);
		}
		else {
		return names.get(index);
		}
	}
	/**
	 * 指定されたキー文字列のインデックスを応答する。
	 */
	private int indexOf(String aString) {
		return keys.indexOf(aString);
	}
	
	/**
	 * 在位日数のインデックスを応答する。
	 */
	public int indexOfDays() {
		return names.indexOf("days");
	}
	
	/**
	 * 画像のインデックスを応答する。
	 */
	public int indexOfImage() {
		return names.indexOf("image");
	}
	
	/**
	 * ふりがなのインデックスを応答する。
	 */
	public int indexOfKana() {
		return names.indexOf("kana");
	}
	
	/**
	 * 氏名のインデックスを応答する。
	 */
	public int indexOfName() {
		return names.indexOf("name");
	}
	
	/**
	 * 番号のインデックスを応答する。
	 */
	public int indexOfNo() {
		return names.indexOf("no");
	}
	
	/**
	 * 代のインデックスを応答する。
	 */
	public int indexOfOrder() {
		return names.indexOf("order");
	}
	
	/**
	 * 政党のインデックスを応答する。
	 */
	public int indexOfParty() {
		return names.indexOf("party");
	}
	
	/**
	 * 在位期間のインデックスを応答する。
	 */
	public int indexOfPeriod() {
		return names.indexOf("period");
	}
	
	/**
	 * 出身地のインデックスを応答する。
	 */
	public int indexOfPlace() {
		return names.indexOf("place");
	}
	
	/**
	 * 出身校のインデックスを応答する。
	 */
	public int indexOfSchool() {
		return names.indexOf("school");
	}
	
	/**
	 * 画像のインデックスを応答する。
	 */
	public int indexOfThumbnail() {
		return names.indexOf("thumbnail");
	}
	
	/**
	 * 指定されたインデックスに対応するキーを応答する。
	 */
	protected String keyAt(int index) {
		return keys.get(index);
	}
	
	/**
	 * キー群を応答する。
	 */
	public ArrayList<String> keys() {
		return keys;
	}
	
	/**
	 * 指定されたインデックスに対応する名前を応答する。
	 */
	protected String nameAt(int index) {
		return names.get(index);
	}
	
	/**
	 * 名前群を応答する。
	 */
	public ArrayList<String> names() {
		return names;
	}
	
	/**
	 * 名前群を設定する。
	 */
	public void names(ArrayList<String> aCollection) {
		names = aCollection;
	}
	
	/**
	 * 属性リストの長さを応答する。
	 */
	public int size() {
		return names.size();
	}
	
	/**
	 * 自分自身を文字列にして、それを応答する。
	 */
	public String toString() {
		//Overrides:toString in class java.lang.Object
		return "";
	}
}
