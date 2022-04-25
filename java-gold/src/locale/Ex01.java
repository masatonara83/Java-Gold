package locale;

import java.util.Locale;

public class Ex01 {

	public static void main(String[] args) {
		
		/* getDefaultメソッドを使うパターン*/
		Locale locale = Locale.getDefault();
		//国の表示
		System.out.println(locale.getCountry());
		//言語の表示
		System.out.println(locale.getLanguage());
		
		/*コンストラクターを使うパターン*/
		Locale locale2 = new Locale("ja", "JP");
		System.out.println(locale2.getCountry());
		
		/*ロケールクラス使うパターン*/
		Locale locale3 = Locale.US;
		System.out.println(locale3.getLanguage());
		
		/*ビルダーを使うパターン*/
		Locale locale4 = new Locale.Builder()
							.setLanguage("jp")
							.setRegion("JP")
							.build();
		
		/*ファクトリメソッドを使うパターン*/
		Locale locale5 = Locale.forLanguageTag("ex-US-x-lvariant-POSIX");
	}

}
