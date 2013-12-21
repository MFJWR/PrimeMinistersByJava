package primeministers;

/**
 * 表：総理大臣の情報テーブル。
 */
public class Table extends Object
{
	/**
	 * ここを作成してください。
	 * まず、次のページを参照しながら、スケルトン（スタブ）を作ることから始めましょう。
	 * http://www.cc.kyoto-su.ac.jp/~atsushi/Programs/CSV2HTML/PrimeMinistersJavaDoc/index.html
	 */
	//テーブル//
	private Attributes attributes;
	private java.util.ArrayList<Tuple> tuples;
	private java.util.ArrayList<java.awt.image.BufferedImage> images;
	private java.util.ArrayList<java.awt.image.BufferedImage> thumbnails;
	
	//コンストラクタ//
	public Table(){}
	
	//メソッド//
	public void add(Tuple aTuple){}
	public Attributes attributes(){}
	public void attributes(Attributes instanceOfAttributes){}
	public java.util.ArrayList<java.awt.image.BufferedImage> images(){}
	private java.awt.image.BufferedImage picture(java.lang.String aString){}
	public java.util.ArrayList<java.awt.image.BufferedImage> thumbnails(){}
	public java.lang.String toString(){
	//Overrides: toString in class java.lang.Object
	}
	public java.util.ArrayList<Tuple> tuples(){}
}
