package translate;

import com.google.api.GoogleAPI;
import com.google.api.translate.Language;
import com.google.api.translate.Translate;

public class translate {
	public static void main (String[] args) throws Exception {
		  // Replace link with the HTTP referrer to your website address
		  GoogleAPI.setHttpReferrer("link");

		  // Replace key with the Google Translate API key
		  GoogleAPI.setKey("key");
		  String defaultHello = "Hello world";
		  // Do the translation
		  String toFrench = Translate.DEFAULT.execute(defaultHello, Language.ENGLISH, Language.FRENCH);
		  String toPortuguese = Translate.DEFAULT.execute("Hello world", Language.ENGLISH, Language.PORTUGUESE);
		  String toSpanish = Translate.DEFAULT.execute("Hello world", Language.ENGLISH, Language.SPANISH);
		  // You can translate for any Language option :D
		  System.out.println(toFrench);
		  System.out.println(toPortuguese);
		  System.out.println(toSpanish);
		}
}
