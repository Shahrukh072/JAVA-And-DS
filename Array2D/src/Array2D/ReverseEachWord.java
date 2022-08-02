package Array2D;

public class ReverseEachWord {
	public static String reverseEachWord(String str) {
		String ans = "";
		int currentWordstart = 0;
		int i = 0;
		for(; i<str.length(); i++) {
			if(str.charAt(i) == ' ') {
				int currentWordEnd = i-1;
				String reverseWord = "";
				for(int j= currentWordstart; j<= currentWordEnd; j++) {
					reverseWord = str.charAt(j)+ reverseWord;
				}
				ans += reverseWord +" ";
				currentWordstart = i+1;
				
			}
		}
		int currentWordEnd = i-1;
		String reverseWord = "";
		for(int j= currentWordstart; j<= currentWordEnd; j++) {
			reverseWord = str.charAt(j)+ reverseWord;
		}
		ans += reverseWord ;
		return ans;
	}

	public static void main(String[] args) {
		String str = "abc deg ghi jkl";
		System.out.println(reverseEachWord(str));

	}

}
