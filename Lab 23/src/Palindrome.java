
public class Palindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome("noon"));
		System.out.println(isPalindrome("Madam I'm Adam"));
		System.out.println(isPalindrome("A man, a plan, a canal, Panama"));
		System.out.println(isPalindrome("A Toyota"));
		System.out.println(isPalindrome("Not a palindrome"));
		System.out.println(isPalindrome("asdfghfdsa"));
	}
	
	public static boolean isPalindrome(String in) {
		if(in==null) {
			return false;
		}
		return isPalindromeHelper(in.toUpperCase());
	}
	
	private static boolean isPalindromeHelper(String in) {
		//base case: if the string is empty or single character string
		if(in.length()<=1)
			return true;
		//if the first char is not letter, skip it
		if(!Character.isLetter(in.charAt(0)))
			return isPalindromeHelper(in.substring(1));
		//if the last char is not letter, skip it 
		if(!Character.isLetter(in.charAt(in.length()-1)))
			return isPalindromeHelper(in.substring(0,in.length()-1));
		//the first pair are letters, then start comparing
		if (in.charAt(0)!=in.charAt(in.length()-1)) 
			return false; //not matched
		else
			return isPalindromeHelper(in.substring(1,in.length()-1));
		
	}
}
