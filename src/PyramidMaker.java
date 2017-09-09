import java.util.*;

public class PyramidMaker {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int pyramidLength;
		
	    System.out.print("How tall of a pyramid do you want: ");
	    pyramidLength = cin.nextInt();
	 
	    int row = 1;
	 
	    for (int i = pyramidLength; i > 0; i--) {
	    	for (int j = 1; j <= i*2; j++)
	    		System.out.print(" ");
	 
	        for (int j = 1; j <= row; j++)             
	            System.out.print(j+" ");

	        for (int j = row-1; j >= 1; j--)
	        	System.out.print(j+" ");             
	             
	            System.out.println();
	            row++;
	     }
	}
}
	