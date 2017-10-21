
public class String_Challenges {

	public static void main(String[] args) {
		// 1. Replace string in a text with another string using StringBuffer
		ReplaceString str = new ReplaceString("foo bar", "foo", "bar");
		System.out.println(str.replaceNow());
		
		// 2. Find all the occurrences of a string in another string
		FindOccurrences find = new FindOccurrences("foo bar foo bar foo bar", "foo");
		int n = find.findAll();
		System.out.println(n);	
		
		// 3. Extract all the words from a string separated by spaces and print them line by line
		ExtractWords extract = new ExtractWords("These words are shown on separate lines");
		extract.showLineByLine();
	}

}

class ExtractWords {
	private String text;
	
	public ExtractWords(String str) {
		this.text = str;
	}
	
	public void showLineByLine() {
		int currentPosition = 0;
		int lastPosition = 0;
		
		do {
			currentPosition = text.indexOf(" ", lastPosition);
			if(currentPosition != -1) {
				System.out.println(text.substring(lastPosition, currentPosition));
				lastPosition = currentPosition + 1;
			}
		} while(currentPosition != -1);
		
		return;
	}
}

class FindOccurrences {
	private String text;
	private String toCount;
	private int n;
	
	public FindOccurrences(String a, String b) {
		this.text = a;
		this.toCount = b;
		n = 0;
	}
	
	public int findAll() {
		int currentPosition = 0;
		do {
			currentPosition = text.indexOf(toCount, currentPosition);
			if(currentPosition != -1) {
				this.n ++;
				currentPosition ++;
			}
		} while(currentPosition != -1);
		
		return this.n;
	}
}

class ReplaceString {
	private String text;
	private String toReplace;
	private String newString;
	
	public ReplaceString(String a, String b, String c) {
		this.text = a;
		this.toReplace = b;
		this.newString = c;
	}
	
	public String replaceNow() {
		int wordStart = this.text.indexOf(toReplace);
		
		if(wordStart == -1) {
			return "The string you want to replace cannot be found!";
		}
		
		StringBuffer aux = new StringBuffer();
		aux.append(this.text);
		aux.replace(wordStart, wordStart + toReplace.length(), newString);
		return aux.toString();
	}
}
