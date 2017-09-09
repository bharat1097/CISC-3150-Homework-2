import java.util.*;

public class Calendar {

	public static void main(String[] args) {
	    Scanner cin = new Scanner(System.in);
	    int year, startDay;
	    
	    System.out.print("Enter a year: ");
	    year = cin.nextInt();
	    System.out.print("What day did the year start (for example, '0' for Sunday, '1' for Monday and so forth): ");
	    startDay = cin.nextInt();
	    
	    String month = ""; 
	    int days = 0;
	    int dayCounter = startDay;
	    
	    for (int monthNumber= 1; monthNumber <=12; monthNumber++)
	    {
	    	switch (monthNumber) {
	    		case 1:  month = "January"; days = 31; break;
	            case 2:  month = "February";
	                    if ((year % 4 == 0 && year % 100 !=0) || year % 400 == 0) {
	                    	days = 29;
	                             break;
	                     }
	                    else {  
	                    	days = 28;
	                        break;
	                     }
	            case 3:  month = "March"; 	  days = 31; break; 
	            case 4:  month = "April"; 	  days = 30; break; 
	            case 5:  month = "May"; 	  days = 31; break;
	            case 6:  month = "June"; 	  days = 30; break;
	            case 7:  month = "July";  	  days = 31; break;
	            case 8:  month = "August";    days = 31; break;
	            case 9:  month = "September"; days = 30; break; 
	            case 10: month = "October";   days = 31; break; 
	            case 11: month = "November";  days = 30; break; 
	            case 12: month = "December";  days = 31; break;                  
	        }

	    		System.out.printf("%10s %d  \n", month , year);	    		
	    		System.out.println("Su Mo Tu We Th Fr Sa");

	    		for (int space = 1; space <= startDay; space++) 
	    			System.out.printf("%3s", " ");
	    		
	    		for (int i = 1; i <=days; i++)
	    		{
	    			dayCounter++;
	    			if (dayCounter% 7==0)
	    				System.out.printf("%-3d\n", i);
	                else
	                    System.out.printf("%-3d", i);
	    		}
	    		startDay = (startDay + days)%7;
	    		System.out.println("\n");
	    }    
	}
}
