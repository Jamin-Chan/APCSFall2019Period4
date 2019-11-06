package fracCalc;

import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);
    	System.out.println("What is your equation?");
    	String equation = userInput.nextLine();
    	String stop = " ";
  
    	while(stop != "quit") {
    		// TODO: Read the input from the user and call produceAnswer with an equation
    		produceAnswer(equation);
    		System.out.println("If stop, type 'quit'");
    		stop = userInput.nextLine();
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
    	String num1[];
    	String num2[];
    	String split1Frac;
    	String split2Frac;
    	if(numOpNum[0].contains("_")) {
    		num1 = numOpNum[0].split("_");
    		num1 = num1[2].split("/");
    		split1Frac = "whole:" + num1[0] + "numerator:" + num1[1] + "denominator:" + num1[2];
    	} else {
    		num1 = numOpNum[0].split("/");
    		split1Frac =  "numerator:" + num1[0] + "denominator:" + num1[1];
    	}
    	
    	if(numOpNum[2].contains("_")) {
    		num2 = numOpNum[2].split("_");
    		num2 = num2[1].split("/");
    		split2Frac = "whole:" + num2[0] + "numerator:" + num2[1] + "denominator:" + num2[2];
    	} else {
    		num2 = numOpNum[2].split("/");
    		split2Frac =  "numerator:" + num2[0] + "denominator:" + num2[1];
    	}

    	return split2Frac;

    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
