package fracCalc;

import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);
    	boolean stop = false;
  
    	while(stop == false) {
    		// TODO: Read the input from the user and call produceAnswer with an equation
    		System.out.println("What is your equation?");
        	String equation = userInput.nextLine();
    		System.out.println(produceAnswer(equation));
    		System.out.println("If stop, type 'quit'");
    		if(userInput.nextLine().equals("quit")) {
    			stop = true;    		
    		}
    	}
    	userInput.close();
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input) {
    	// TODO: Implement this function to produce the solution to the input
    	String numOpNum[] = input.split(" ");
    	String whole1[];
    	String whole2[];
    	String frac1[];
    	String frac2[];
    	String split1Frac;
    	String split2Frac;
    	if(numOpNum[0].contains("_")) {
    		whole1 = numOpNum[0].split("_");
    		if(numOpNum[0].contains("/")) {
    			frac1 = whole1[1].split("/");
    			split1Frac = "whole:" + whole1[0] + " numerator:" + frac1[0] + " denominator:" + frac1[1];
    		} else {
    			split1Frac = "whole:" + whole1[0] + " numerator:0 denominator:1";
    		}
    	} else if(numOpNum[0].contains("/")){
    		frac1 = numOpNum[0].split("/");
    		split1Frac =  "whole:0 numerator:" + frac1[0] + " denominator:" + frac1[1];
    	} else {
    		split1Frac = "whole:" + numOpNum[0] + " numerator:0 denominator:1";
    	}
    	
    	if(numOpNum[2].contains("_")) {
    		whole2 = numOpNum[2].split("_");
    		if(numOpNum[2].contains("/")) {
    			frac2 = whole2[1].split("/");
    			split2Frac = "whole:" + whole2[0] + " numerator:" + frac2[0] + " denominator:" + frac2[1];
    		} else {
    			split2Frac = "whole:" + whole2[0] + " numerator:0 denominator:1";
    		}
    	} else if(numOpNum[2].contains("/")){							
    		frac2 = numOpNum[2].split("/");
    		split2Frac =  "whole:0 numerator:" + frac2[0] + " denominator:" + frac2[1];
    	} else {
    		split2Frac = "whole:" + numOpNum[2] + " numerator:0 denominator:1";
    	}

    	return split2Frac;
    }
    // TODO: Fill in the space below with any helper methods that you think you will need
}
