package primeministers;

/**
 * ダウンローダ：総理大臣のCSVファイル・画像ファイル・サムネイル画像ファイルをダウンロードする。
 */
public class Downloader extends IO
{
	/**
	 * ここを作成してください。
	 * まず、次のページを参照しながら、スケルトン（スタブ）を作ることから始めましょう。
	 * http://www.cc.kyoto-su.ac.jp/~atsushi/Programs/CSV2HTML/PrimeMinistersJavaDoc/index.html
	 */
	//フィールド//
	private java.lang.String url;
	//コンストラクタ//
	public Downloader(){}
	//メソッド//
	public void downloadCSV(){}
	public void downloadImages(){}
	private void downloadPictures(int indexOfPicture){}
	public void downloaadThumbnails(){}
	public Table table(){
	//Overrides:table in class IO
	}
	public java.lang.String url(){}
	public static java.lang.String urlString(){}
	public static java.lang.String urlStringOfCSV(){}
}
