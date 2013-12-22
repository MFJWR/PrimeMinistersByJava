package primeministers;

import java.io.File;

/**
 * ダウンローダ：総理大臣のCSVファイル・画像ファイル・サムネイル画像ファイルをダウンロードする。
 */
public class Downloader extends IO {
	/**
	 * ここを作成してください。 まず、次のページを参照しながら、スケルトン（スタブ）を作ることから始めましょう。
	 * http://www.cc.kyoto-
	 * su.ac.jp/~atsushi/Programs/CSV2HTML/PrimeMinistersJavaDoc/index.html
	 */
	// フィールド//
	private String url;

	// コンストラクタ//
	public Downloader() {
		super();
		this.url = null;
	}

	// メソッド//
	public void downloadCSV() {

	}

	public void downloadImages() {
		this.url = "images/";
		File aImageDirectory = new File("/Desktop/SouriDaijin/" + this.url);
		if (aImageDirectory.exists())
			aImageDirectory.delete();
		aImageDirectory.mkdir();
		for (int i = 39; i < 63; i++) {
			this.downloadPictures(i);
		}
	}

	private void downloadPictures(int indexOfPicture) {

	}

	public void downloaadThumbnails() {
		this.url = "thumbnails/";
		File aThumbnailDirectory = new File("/Desktop/SouriDaijin/" + this.url);
		if (aThumbnailDirectory.exists())
			aThumbnailDirectory.delete();
		aThumbnailDirectory.mkdir();
		for (int i = 39; i < 63; i++) {
			this.downloadPictures(i);
		}
	}

	public Table table() {
		// Overrides:table in class IO
		super.directoryOfPages();
		this.downloadCSV();
		this.downloadImages();
		this.downloaadThumbnails();
		return super.table(); // ?
	}

	public String url() {
		return this.url;
	}

	public static String urlString() {
		return "http://www.cc.kyoto-su.ac.jp/~atsushi/Programs/CSV2HTML/PrimeMinisters/";
	}

	public static String urlStringOfCSV() {
		return "http://www.cc.kyoto-su.ac.jp/~atsushi/Programs/CSV2HTML/PrimeMinisters/PrimeMinisters.csv";
	}
}
