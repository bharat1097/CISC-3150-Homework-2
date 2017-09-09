import java.util.*;

public class ChangeDelimiter {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in).useDelimiter(",");
		
		System.out.print("Enter a few comma separated values (add an additional comma at the end): ");
		
		while(cin.hasNext()) {
			System.out.println(cin.next());
		}
	}
}
