/* Jamin Chan
 * 8/29/19
 * 4th period
 * Group of methods that perform calcultions
 */

public class Calculate {
	
	public static int square(int number) {
		return number * number;
	}
	
	public static int cube(int number ) {
		return number * number * number;
	}
	
	public static double average(double number1, double number2) {
		return (number1 + number2) / 2;
	}
	
	public static double toDegrees(double radians) {
		double degrees = 0;
		degrees = (180 / 3.14159) * (radians);
		return degrees;
	}
	
	public static double toRadians(double degrees) {
		double radians = 0;
		radians = (3.14159 / 180) * (degrees);
		return radians;
	}
	
	public static double discriminant(double number1, double number2, double number3) {
		double discriminant = 0;
		discriminant = (number2 * number2) - (4 * number1 * number3);
		return discriminant;
	}
	
	public static String toImproperFrac(int num1, int num2, int num3) {
		int numerator = 0;
		numerator = (num1 * num3) + num2;
		return numerator + "/" + num3;
	}
	
	public static String toMixedNum(int num1, int num2) {
		int wholeNum = num1 / num2;
		int numerator = num1 % num2;
		return wholeNum + "_" + numerator + "/" + num2;
	}
	
	public static String foil(int num1, int num2, int num3, int num4) {
		int firstNum = num1 *num3;
		int secondNum = (num1 *num4) + (num2 * num3);
		int thirdNum = num2 * num4;
		return firstNum + "x^2 + " + secondNum + " x + " + thirdNum;
	}
	
	public static boolean isDivisibleBy(int num1, int num2) {
		if(num1 % num2 == 0) {
			return true;
		} else { 
			return false;
		}
	}
	
	public static double absValue(double num1) {
		if( num1 >= 0 ) {
			return num1;
		} else {
			return num1 - (2 * num1);
		}
	}
	
	public static double max1(double num1, double num2) {
		if(num1 > num2) {
			return num1;
		} else if(num2 > num1) {
			return num2; 
		} else {
			return num1;
		}
	}
	
	public static double max2(double num1, double num2, double num3) {
		if(num1 > num2 & num1 > num3) {
			return num1;
		} else if(num2 > num1 & num2 > num3) {
			return num3;
		} else if(num3 > num1 & num3 > num1) {
			return num3;
		}
	}
	
	public static int min(int num1, int num2) {
		if(num1 < num2) {
			return num1;
		} else if(num2 < num1) {
			return num2;
		} else {
			return num1;
		}
	}
	
	public static double round2(double num1) {
		double round = 0;
		round = (num1 * 100) + 0.5;
		int rounded = (int) round;
		double rounded2 = (double) rounded;
		rounded2 = rounded2 / 100;
		return rounded2;
	}
	
	public static double exponent(double num1, int exp) {
		double multiply = 1;
		for (int i = 0; i == exp; i++) {
			multiply = multiply * num1;
		}
		
		return multiply;
	}
}













