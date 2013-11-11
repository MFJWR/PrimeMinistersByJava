package primeministers;

/**
 * 属性群：総理大臣の情報テーブルを入出力する際の属性情報を記憶。
 */
public class Attributes extends Object
{
	/**
	 * ここを作成してください。
	 * まず、次のページを参照しながら、スケルトン（スタブ）を作ることから始めましょう。
	 * http://www.cc.kyoto-su.ac.jp/~atsushi/Programs/CSV2HTML/PrimeMinistersJavaDoc/index.html
	 */
	//フィールド//
	private java.util.ArrayList<java.lang.String> keys;
	private java.util.ArrayList<java.lang.String> names;
	
	//コンストラクタ//
	public Attributes(java.lang.String aString){}
	
	//メソッド//
	protected java.lang.String at(int index){}
	private int indexOf(java.lang.String aString){}
	public int indexOfDays(){}
	public int indexOfImage(){}
	public int indexOfKana(){}
	public int indexOfName(){}
	public int indexOfNo(){}
	public int indexOfOrder(){}
	public int indexOfParty(){}
	public int indexOfPeriod(){}
	public int indexOfPlace(){}
	public int indexOfSchool(){}
	public int indexOfThumbnail(){}
	public java.util.ArrayList<java.lang.String> keys(){}
	protected java.lang.String nameAt(int index){}
	public java.util.ArrayList<java.lang.String> names(){}
	public void names(java.util.ArrayList<java.lang.String> aCollection){}
	public int size(){}
	public java.lang.String toString(){
	//Overrides:toString in class java.lang.Object
	}
}
