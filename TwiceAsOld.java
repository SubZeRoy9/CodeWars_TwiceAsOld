/*Your function takes two arguments:

    1. current father's age (years)
    2. current age of his son (years)

	Calculate how many years ago the father was twice as old as his son (or in how many years he will be twice as old). 
	The answer is always greater or equal to 0, no matter if it was in the past or it is in the future.

 */
import java.util.Scanner;

public class TwiceAsOld {

		static int fage;
		static int sage;
		
		public static void main(String[] args) {
			
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the fathers age.");
			fage = scan.nextInt();
			
			System.out.println("Enter the sons age.");
			sage = scan.nextInt();
			
			scan.close();
			
			
			
			System.out.println(TwiceAsOld(fage, sage));

		}
		

		public static int TwiceAsOld(int dadYears, int sonYears){
			    
			sonYears *= 2;
			    
			if (dadYears <= sonYears) {
			   
				return sonYears - dadYears;
			      
			    }
			else {
				
			    return dadYears - sonYears;
			    }
			    
			  
			  }

			}
			


