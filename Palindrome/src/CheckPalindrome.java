import java.io.IOException;

/**
 * 
 * @author Alireza Aghamohammadi 6/27/11 function that determines if a given
 *         string is a palindrome. A palindrome is a word or phrase that is
 *         spelled exactly the same forwards or backwards, like "pop" or
 *         "Ah, Satan sees Natasha". For this question, ignore all
 *         non-alphanumeric characters and assume that upper-and lower-case
 *         characters are identical. The function should output whether or not
 *         the string is a palindrome and return a boolean.
 * 
 */

public class CheckPalindrome {
	public static void main(String[] args) throws IOException {

		String phrase = "1Ah, Satan sees Natasha1";
		// Alireza Aghamohammadi 6/27/11- make everything low so we would ignore
		// the upper or lower case
		phrase = phrase.toLowerCase();
		// Alireza Aghamohammadi 6/27/11- remove all non-alphanumeric characters
		// so we would ignore it in our
		// check
		phrase = phrase.replaceAll("[^a-zA-Z0-9]", "");
		// call the method with a a phrase
		boolean isPalindrom = checkForpalindrome(phrase);

		// Alireza Aghamohammadi 6/27/11- just print something on the
		// screen/console to make the user happy :)
		if (isPalindrom) {
			System.out.println("it is palindrome");
		} else {
			System.out.println("it is NOT  palindrome");
		}

	}

	// Alireza Aghamohammadi 6/27/11 this is the method which does the check
	private static boolean checkForpalindrome(String phraseReceived) {
		boolean palindrome = false;
		int left = 0;
		int right = phraseReceived.length() - 1;
		int counter = 0;
		while (left < right) {
			if (phraseReceived.charAt(left) != phraseReceived.charAt(right)) {
				counter = 0;
			} else {
				counter++;
			}
			left++;
			right--;
		}
		if (counter != 0) {
			// Alireza Aghamohammadi 6/27/11- it is palindrome
			palindrome = true;
		}
		return palindrome;
	}

}
