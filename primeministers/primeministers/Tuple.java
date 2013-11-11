package primeministers;

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
	//フィールド//
	private Attributes attributes;
	private java.util.ArrayList<java.lang.String> values;
	
	//コンストラクタ//
	public Tuple(Attributes instanceOfAttributes,java.util.ArrayList<java.lang.String> valuesCollection){}
	
	//メソッド//
	public Attributes attributes(){}
	public java.lang.String toString(){
	//Overrides:toString in class java.lang.Object
	}
	public java.util.ArrayList<java.lang.String> values(){}
	
}
