package primeministers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

/**
 * 入出力：リーダ・ダウンローダ・ライタを抽象する。
 */
public abstract class IO extends Object {
	/**
	 * ここを作成してください。 まず、次のページを参照しながら、スケルトン（スタブ）を作ることから始めましょう。
	 * http://www.cc.kyoto-
	 * su.ac.jp/~atsushi/Programs/CSV2HTML/PrimeMinistersJavaDoc/index.html
	 */
	// フィールド//
	protected Table table;

	// コンストラクタ//
	public IO() {
	}

	// メソッド//
	public static void deleteFileOrDirectory(File aFile) {
		aFile.delete();
	}

	public static File directoryOfPages() {
		File aDirectory = new File(System.getProperty("user.home")
				+ "/Desktop/SouriDaijin/");
		if (aDirectory.exists())
			aDirectory.delete();
		aDirectory.mkdir();
		File aImageDirectory = new File(aDirectory.getPath() + "/images");
		if (aImageDirectory.exists())
			aImageDirectory.delete();
		aImageDirectory.mkdir();
		File aThumbnailDirectory = new File(aDirectory.getPath()
				+ "/thumbnails");
		if (aThumbnailDirectory.exists())
			aThumbnailDirectory.delete();
		aThumbnailDirectory.mkdir();
		return aDirectory;
	}

	public static String encodingSymbol() {
		return "UTF-8";
	}

	public static ArrayList<String> readTextFromFile(File aFile) {
		FileInputStream aStream = null;
		BufferedReader aReader = null;
		ArrayList<String> rowList = new ArrayList<String>();
		try {
			aStream = new FileInputStream(aFile);
			aReader = new BufferedReader(new InputStreamReader(aStream));
			String row;
			while ((row = aReader.readLine()) != null)
				rowList.add(row);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				aStream.close();
				aReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rowList;
	}

	public static ArrayList<String> readTextFromFile(String fileString) {
		File aFile = new File(fileString);
		FileInputStream aStream = null;
		BufferedReader aReader = null;
		ArrayList<String> rowList = new ArrayList<String>();
		try {
			aStream = new FileInputStream(aFile);
			aReader = new BufferedReader(new InputStreamReader(aStream));
			String row;
			while ((row = aReader.readLine()) != null)
				rowList.add(row);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				aStream.close();
				aReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rowList;

	}

	public static ArrayList<String> readTextFromURL(String urlString) {
		InputStream aStream = null;
		BufferedReader aReader = null;
		ArrayList<String> rowList = new ArrayList<String>();
		try {
			aStream = new URL(urlString).openStream();
			aReader = new BufferedReader(new InputStreamReader(aStream));
			String row;
			while ((row = aReader.readLine()) != null)
				rowList.add(row);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				aStream.close();
				aReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rowList;
	}

	public static ArrayList<String> readTextFromURL(URL aURL) {
		InputStream aStream = null;
		BufferedReader aReader = null;
		ArrayList<String> rowList = new ArrayList<String>();
		try {
			aStream = aURL.openStream();
			aReader = new BufferedReader(new InputStreamReader(aStream));
			String row;
			while ((row = aReader.readLine()) != null)
				rowList.add(row);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				aStream.close();
				aReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rowList;
	}

	public static ArrayList<String> splitString(String string, String separators) {
		ArrayList<String> arrayList = new ArrayList<String>();
		for (String separatedString : string.split(separators))
			arrayList.add(separatedString);
		return arrayList;
	}

	public Table table() {
		return this.table;
	}

	public static void writeText(ArrayList<String> aCollection, File aFile) {
	}

	public static void writeText(ArrayList<String> aCollection,
			String fileString) {
	}

}
