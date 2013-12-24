package primeministers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

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
		File aCSVFile = new File(System.getProperty("user.home")
				+ "/Desktop/SouriDaijin/PrimeMinisters.csv");
		if (aCSVFile.exists())
			aCSVFile.delete();
		InputStream aStream = null;
		FileOutputStream anOutputStream = null;

		try {
			URL aUrl = new URL(Downloader.urlStringOfCSV());
			aStream = aUrl.openConnection().getInputStream();
			anOutputStream = new FileOutputStream(aCSVFile);
			byte[] bytes = new byte[512];
			int number;
			while (true) {
				if ((number = aStream.read(bytes)) == -1)
					break;
				anOutputStream.write(bytes, 0, number);
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				anOutputStream.close();
				aStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void downloadImages() {
		this.url = "images/";
		for (int i = 39; i < 63; i++) {
			this.downloadPictures(i);
		}
	}

	public void downloaadThumbnails() {
		this.url = "thumbnails/";
		for (int i = 39; i < 63; i++) {
			this.downloadPictures(i);
		}
	}

	private void downloadPictures(int indexOfPicture) {
		String aFileName = this.url + "0" + indexOfPicture + ".jpg";
		File aPicture = new File(System.getProperty("user.home")
				+ "/Desktop/SouriDaijin/" + aFileName);

		InputStream aStream = null;
		FileOutputStream anOutputStream = null;

		try {
			URL aUrl = new URL(Downloader.urlString() + aFileName);
			aStream = aUrl.openConnection().getInputStream();
			anOutputStream = new FileOutputStream(aPicture);
			byte[] bytes = new byte[512];
			int number;
			while (true) {
				if ((number = aStream.read(bytes)) == -1)
					break;
				anOutputStream.write(bytes, 0, number);
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				anOutputStream.close();
				aStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
