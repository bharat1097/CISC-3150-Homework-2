import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		String string, reverse = "";
	    Scanner cin = new Scanner(System.in);
	 
	    System.out.print("Enter a string: ");
	    string = cin.nextLine();
	 
	    int length = string.length();
	 
	    for (int i = length - 1; i >= 0; i-- )
	         reverse += string.charAt(i);
	 
	    if (string.equals(reverse))
	    	System.out.println("Entered string IS a palindrome.");
	    else
	        System.out.println("Entered string is NOT a palindrome.");
	}
}
