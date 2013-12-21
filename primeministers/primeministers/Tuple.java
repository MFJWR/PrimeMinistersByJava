package primeministers;

import java.util.ArrayList;
// import java.lang.String;

/**
 * タプル：総理大臣の情報テーブルの中の各々のレコード。
 */
public class Tuple extends Object
{
	/**
	 * ここを作成してください。
	 * まず、次のページを参照しながら、スケルトン（スタブ）を作ることから始めましょう。
	 * http://www.cc.kyoto-su.ac.jp/~atsushi/Programs/CSV2HTML/PrimeMinistersJavaDoc/index.html
	 */
	
	
	/**
	 * 属性リストを記憶するフィールド。
	 */
	private Attributes attributes;
	
	/**
	 * 値リストを記憶するフィールド。
	 */
	private ArrayList<String> values;
	

	/**
	 * 属性リストと値リストからタプルを作るコンストラクタ。
	 */
	public Tuple(Attributes instanceOfAttributes, ArrayList<String> valuesCollection){
		values = new ArrayList<String>();
		
		attributes = instanceOfAttributes;
		values = valuesCollection;
	}
	

	/**
	 * 属性リストを応答する。
	 */
	public Attributes attributes(){
		return attributes;
	}
	
	/**
	 * 自分自身を文字列にして、それを応答する。
	 */
	public String toString(){
	//Overrides:toString in class java.lang.Object
		return "";
	}
	
	/**
	 * 値リストを応答する。
	 */
	public ArrayList<String> values(){
		return values;
	}
	
}
