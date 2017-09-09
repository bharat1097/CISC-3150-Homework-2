
public class LabeledLoops {

	public static void main(String[] args) {
		
		outer:
			for(int i = 0; i < 4; i++) {
				System.out.println("Inside outer for-loop");
				System.out.println(i);
				for(int j = 0; j < 4; j++) {
					System.out.println("Now, inside inner for-loop");
					System.out.println(j);
					break outer;
				}
			}
		System.out.print("Exited the for loops");
	}
}
