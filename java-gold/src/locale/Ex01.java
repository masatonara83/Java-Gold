package locale;

import java.util.Locale;

public class Ex01 {

	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		//国の表示
		System.out.println(locale.getCountry());
		//言語の表示
		System.out.println(locale.getLanguage());
		
		Locale locale2 = new Locale("ja", "JP");
		System.out.println(locale2.getCountry());
		
		Locale locale3 = Locale.US;
		System.out.println(locale3.getLanguage());

	}

}
