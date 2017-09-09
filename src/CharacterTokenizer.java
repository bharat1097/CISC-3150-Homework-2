import java.util.*;

public class CharacterTokenizer {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in).useDelimiter("");

		System.out.print("Enter a string: ");
		
		while(cin.hasNext())
			System.out.println(cin.next());
	}
}
