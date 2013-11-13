package primeministers;

/**
 * 入出力：リーダ・ダウンローダ・ライタを抽象する。
 */
public abstract class IO extends Object
{
	/**
	 * ここを作成してください。
	 * まず、次のページを参照しながら、スケルトン（スタブ）を作ることから始めましょう。
	 * http://www.cc.kyoto-su.ac.jp/~atsushi/Programs/CSV2HTML/PrimeMinistersJavaDoc/index.html
	 */
	//フィールド//
	protected Table table;
	
	//コンストラクタ//
	public IO(){}
	
	//メソッド//
	public static void deleteFileOrDirectory(java.io.File aFile){}
	public static java.io.File directoryOfPages(){}
	public static java.lang.String encodingSymbol(){}
	public static java.util.ArrayList<java.lang.String> readTextFromFile(java.io.File aFile){}
	public static java.util.ArrayList<java.lang.String> readTextFromFile(java.lang.String fileString){}
	public static java.util.ArrayList<java.lang.String> readTextFromURL(java.lang.String urlString){}
	public static java.util.ArrayList<java.lang.String> readTextFromURL(java.net.URL aURL){}
	public static java.util.ArrayList<java.lang.String> splitString(java.lang.String string,java.lang.String separators){}
	public Table table(){}
	public static void writeText(java.util.ArrayList<java.lang.String> aCollection,java.io.File aFile){}
	public static void writeText(java.util.ArrayList<java.lang.String> aCollection,java.lang.String fileString){}
	
}
