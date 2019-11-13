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
    	String num1 = numOpNum[0];
    	String num2 = numOpNum[3];
    	String separated1[] = separate(num1);
    	String separated2[] = separate(num2);
    	
    	
    	//int whole = Integer.parseInt();
    	if(numOpNum[1].equals("+")) {
    		add(separated1, separated2);
    	} else if(numOpNum[1].equals("-")) {
    		
    	} else if(numOpNum[1].equals("*")) {
    		
    	} else if(numOpNum[1].equals("/")) {
    	
    	}
    	return "";
    }
    
    public static String[] separate(String num1) {
    	
    	String number[] = new String[3];
    	number[0] = "0";
    	number[1] = "0";
    	number[2] = "1";
    	
    	if(num1.contains("/")) {
    		String split[] = num1.split("/");
    		number[2] = split[1];
    	}
    	if(num1.contains("_")) {
    		String num[] = num1.split("_");
    		number[0] = num[0];
    		if(num[1].contains("/")) {
    			String frac[] = num[1].split("/");
    			number[1] = frac[0];
    		}
    	}	
    	System.out.println(number[0]);
    	return number;
    }
    
    
    public static void add(String[] num1, String[] num2) {
    	
   	}
    
    public static void substract(String[] num1, String[] num2) {
    	
   	}
    	
    public static void multiply(String[] num1, String[] num2) {
	
	}
	
    public static void divide(String[] num1, String[] num2) {
    	
	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    // TODO: Fill in the space below with any helper methods that you think you will need
}
