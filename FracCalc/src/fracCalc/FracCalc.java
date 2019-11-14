package fracCalc;
import java.util.Scanner;
public class FracCalc {
    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);
    	boolean stop = false;
    	while(stop == false) {
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
    public static String produceAnswer(String input) {
    	String numOpNum[] = input.split(" ");
    	String num1 = numOpNum[0];
    	String num2 = numOpNum[2];
    	String separated1[] = separate(num1);
    	String separated2[] = separate(num2);
    	int whole1 = Integer.parseInt(separated1[0]);
    	int numer1 = Integer.parseInt(separated1[1]);
    	int den1 = Integer.parseInt(separated1[2]);
    	int whole2 = Integer.parseInt(separated2[0]);
    	int numer2 = Integer.parseInt(separated2[1]);
    	int den2 = Integer.parseInt(separated2[2]);
    	System.out.println(numer1 + " " + den1 + " " + numer2 + " " + den2);
    	if(whole1 > 0) {
    		numer1 += whole1 * den1;
    	} else {
    		numer1 = (whole1 * den1) - numer2;
    	}
    	if(whole2 > 0) {
    		numer2 += whole2 * den2;
    	} else {
    		numer2 = (whole2 * den2) - numer2;
    	}
    	System.out.println(numer1 + " " + den1 + " " + numer2 + " " + den2);
    	if(den1 != den2) {
    		den1 *= den2;
    		numer1 *= den1;
    		numer2 *= den1;
    	}
    	System.out.println(numer1 + " " + den1 + " " + numer2 + " " + den2);
    	if(numOpNum[1].equals("+")) {
    		numer1 += numer2;
    	}else if(numOpNum[1].equals("-")) {
    		numer1 -= numer2; 
    	} else if(numOpNum[1].equals("/")) {
    		numer1 = numer1 * den1;
    		den1 *= numer2;
    		System.out.println(numer1 + " " + den1 + " " + numer2 + " " + den2);
    		if(den1 < 0) {
    			numer1 *= -1;
    			den1 *= -1;
    		}
    	}else if(numOpNum[1].equals("*")) {
    		numer1 *= numer2;
    		den1 *= den1;
    	}
    	System.out.println(numer1 + " " + den1 + " " + numer2 + " " + den2);
    	int divisible = gcf(numer1, den1);
    	System.out.println(divisible);
    	if(divisible > 1) {
    		numer1 /= divisible;
    		den1 /= divisible;
    	}
    	if(numer1 > den1) {
    		whole1 = numer1 / den1;
    		numer1 -= (whole1 * den1);
    	}
    	System.out.println(numer1 + " " + den1 + " " + numer2 + " " + den2);
    	if(whole1 == 0 && numer1 != 0) {
    		return numer1 + "/" + den1;
    	} else if(numer1 == 0 && whole1 != 0 ) {
    		return whole1 + "";
    	} else if(numer1 != 0 && whole1 != 0) {
    		return whole1 + "_" + numer1 + "/" + den1;
    	} else {
    		return "0";
    	}
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
    	return number;
    }
    public static int gcf(int num1, int num2) {	
    	int divisible = num2;
    		while(divisible != 1) {
				if(num1 % divisible == 0 && num2 % divisible == 0) {
					return divisible;
				}
				if(num1 > 0) {
					divisible--;
				} else {
					divisible++;
				}
			}
    	return 1;
    }   
}
