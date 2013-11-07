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
	private Attributes attributes;
	private java.util.ArrayList<Tuple> tuples;
	private java.util.ArrayList<java.awt.image.BufferedImage> images;
	private java.util.ArrayList<java.awt.image.BufferedImage> thumbnails;	
	
	public Table(){}
	
	public void add(Tuple aTuple){}
	public Attributes attributes(){}
	public void attributes(Attributes instanceOfAttributes){}
	public java.util.ArrayList<java.awt.image.BufferdImage> images(){}
	private java.awt.image.BufferedImage picture(java.lang.String aString){}
	public java.util.ArrayList<java.awt.image.BufferedImage> thumbnails(){}
	public java.lang.String toString(){}

	public java.util.ArrayList<Tuple> tuples(){}
	
}
