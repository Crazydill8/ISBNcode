import java.util.*;

public class ISBNtester {
	
	 static boolean isValidISBN(String isbn)
	    {
		 	String[] numbers = isbn.split("");
		 	if(numbers[9].equals("X") || numbers[9].equals("x"))
		 		numbers[9] = "10";
		 	System.out.println(numbers[9]);
		 	
		 	int[] Numbers = new int[10];
		 	try {
			 	for(int i = 0; i < 10; i++) {
			 		Numbers[i] = Integer.parseInt(numbers[i]);
			 		
			 	}
		 	}catch(NumberFormatException e) {}
		 	
		 	// length must be 10
	        int n = isbn.length();
	        
	        int sum; //initialized weighted sum
	        
	        if (n != 10)
	            return false;
	        
	        	// Checking last digit.
	        	//creates sum if last digit is X 
	        	for(int i = 0; i < 10; i++) {
	        		System.out.println(Numbers[i]);
	        	}
	        	
	        	
	        	sum = (Numbers[0]*10)+(Numbers[1]*9)+(Numbers[2]*8)+(Numbers[3]*7)+(Numbers[4]*6)+(Numbers[5]*5)+(Numbers[6]*4)+(Numbers[7]*3)+(Numbers[8]*2)+(Numbers[9]*1);  
	      	    System.out.println(sum);
	        
	        /*
	        	//prevents incorrect input
		 	 	else if (lastChar != 'X' && (lastChar < '0' ||
		 	 			lastChar > '9'))
		 		 return false;
		 		
		 	 		/*else if(lastChar != 'X' && (lastChar > '0'
		 	 			&& lastChar < '9')) { //creates sum if last digit is not X 
		 	 				sum = (firstChar*10)+(secondChar*9)+(thirdChar*8)+(fourthChar*7)+(fifthChar*6)+(sixthChar*5)+(seventhChar*4)+(eighthChar*3)+(ninthChar*2)+(lastChar*1);
		 	 		}
		 	 	*/
	        
	 
	        // Return true if weighted sum
	        // of digits is divisible by 11.
	        if(sum % 11 == 0)
	        	return true;
	        
	        else
	        	return false;
	        
	        	
	    }
	 	
	    public static void main(String[] args)
	    {
	    	Scanner input = new Scanner(System.in);
	    	
	    	
	    		//takes an ISBN number and uses the 
	    		//isValidISBN function to test it
	    		System.out.println("Enter an ISBN number");
	    		String isbn = input.nextLine();
	    	
	    		
	    		if (isValidISBN(isbn))
	    			System.out.println("Valid");
	    		else
	    			System.out.println("Invalid");
	        
	    			//Checks if code should be ran again
	    	    input.close();
	    	    System.exit(1);
	    			
	    	}	        
	}
