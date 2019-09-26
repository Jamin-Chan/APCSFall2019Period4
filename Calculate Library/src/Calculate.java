/* Jamin Chan
 * 8/29/19
 * 4th period
 * Group of methods that perform calculations
 */

public class Calculate {
	
	/*A call to square returns the square of the value passed. 
	The method accepts an integer and returns an integer. */
	public static int square(int number) {
		return number * number;
	}
	
	/* A call to cube returns the cube of the value passed.
	The method accepts an integer and returns an integer. */
	public static int cube(int number ) {
		return number * number * number;
	}
	
	/*A call to average returns the average of the values passed to it.
	This method accepts two doubles and returns a double. */
	public static double average(double number1, double number2) {
		return (number1 + number2) / 2;
	}
	
	/*Another average method. This one accepts three doubles and returns a double.
	The name is the same, the difference is in the header and the calculation.
	(The ability to define two to more different methods with the same name but different method signitures
	is called overloading. This avergae method is an example of "overloading method".) */
	public static double average(double number1, double number2, double number3) {
		
	}
	
	/*A call to  toDegrees converts an angle measure given in radians into degrees. 
	The method accepts a double and returns a double. 
	The method should use 3.14159 as an approximatation for pi. */
	public static double toDegrees(double radians) {
		double degrees = 0;
		degrees = (180 / 3.14159) * (radians);
		return degrees;
	}
	
	/* A call to toRadians converts an angle measure given in dgrees into radians.
	The method accepts a double and returns a double. The method should use 3.14159 as an approximatation for pi. */
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
	
	
	/*A call to toImproperFrac converts mixed number (with its pieces
	provided separately in the order whole number, numerator, then denominator)
	into an improper fraction. The method accepts a three integers and returns
	a String. */
	public static String toImproperFrac(int num1, int num2, int num3) {
		int numerator = 0;
		numerator = (num1 * num3) + num2;
		return numerator + "/" + num3;
	}
	
	/* A call to to toMixedNum converts an improper fraction (with its pieces provided
	separately in the order numerator then denominator) into a mixed number.
	The method accepts a two integers and returns a String. */
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
	
	public static int factorial(int num) {
		int number = 1;
		for(int num1 = num; num1 == 1; num1--) {
			number = number * num1;
		}
		
		return number;
	}
	
	public static boolean isPrime(int num1) {
		int divide = 0;
		for(divide = num1; divide != 0; divide--) {
			if(num1 / divide > 1) {
				return true;
			}
		}
		return false;
	}
	
	public static int gcf(int num1, int num2) {	
		int divisible = 0;
		for(divisible = num1; divisible != 1; divisible--) {
			if(num1 % divisible == 0 && num2 % divisible == 0) {
				return divisible;
			}
		}
		
		return divisible;
	}
	
	public static double sqrt(double num1) {
		double squared;
		double multiplied;
		for(squared = 0; (num1 - .005) <= squared || squared >= (num1 +.005); squared -= .001) {
			multiplied = squared * squared;
			if((num1 - .005) <= squared || squared >= (num1 +.005)) {
				return round2(multiplied);
			}
		}
		return num1;
	}
	
	public static String quadForm(int num1, int num2, int num3) {
		double roots = discriminant(num1, num2, num3);
		System.out.println(roots);
		if(roots < 0 ){
			String noRoots = "no real roots";
			return noRoots;
		} else if(roots == 0){
			double root0 = -(num2) / (2 *num1);
		
			
			String done2 = Double.toString(root0);
			return done2;
		} else { 
			double roots2;
			roots2 = -(num2) - sqrt(roots);
			roots2 = (roots2) / (2 * num1);
			
			double roots3;
			roots3 = -(num2) + sqrt(roots);
			roots3 = (roots3) / (2 * num1);
			
			String done3 = Double.toString(roots2);
			String done4 = Double.toString(roots3);
			return done3 + " and " + done4;
		}
	}
}













