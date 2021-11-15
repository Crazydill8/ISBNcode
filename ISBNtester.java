import java.util.*;
import java.io.*;

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
		 	
	        int n = isbn.length();
	        
	        int sum; //initialized weighted sum
	        
	        // length must be 10
	        if (n != 10)
	            return false;
	        
	        	// Checking last digit.
	        	//creates sum if last digit is X 
	        	for(int i = 0; i < 10; i++) {
	        		System.out.println(Numbers[i]);
	        	}
	        	
	        	
	        	sum = (Numbers[0]*10)+(Numbers[1]*9)+(Numbers[2]*8)+(Numbers[3]*7)+(Numbers[4]*6)+(Numbers[5]*5)+(Numbers[6]*4)+(Numbers[7]*3)+(Numbers[8]*2)+(Numbers[9]*1);  
	      	    System.out.println(sum);
	       
	      	    
	 
	        // Return true if weighted sum
	        // of digits is divisible by 11.
	        if(sum % 11 == 0)
	        	return true;
	        
	        else
	        	return false;
	        
	        	
	    }
	 	
	    public static void main(String[] args)
	    {
	    	/*
	    	 * This section needs to loop through each line of text file,
	    	 * and inserts isbns of each line into two different files 
	    	 * based on correct or incorrect
	    	 */
	    	
	    	Scanner input = new Scanner("testFile.txt");
	    	
	    	
	    		//takes an ISBN number and uses the 
	    		//isValidISBN function to test it
	    		System.out.println("Enter an ISBN number");
	    	
	    		
	    		if (isValidISBN())
	    			System.out.println("Valid");
	    		//put isbn into valid file here
	    		else
	    			System.out.println("Invalid");
	    		//put isbn into invalid file here
	    	
	    	    input.close();
	    	    System.exit(1);
	    			
	    	}	        
	}
