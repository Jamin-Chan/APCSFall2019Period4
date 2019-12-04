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
		return (number1 + number2 + number3) / 3;
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
	
	// inputs a, b, and c into the equation of discriminant to find the answer
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
		if(num3 == 0) {
			throw new IllegalArgumentException
				("denominator can not be negative");
		}		
		int numerator = 0;
		numerator = (num1 * num3) + num2;
		return numerator + "/" + num3;
	}
	
	/* A call to to toMixedNum converts an improper fraction (with its pieces provided
	separately in the order numerator then denominator) into a mixed number.
	The method accepts a two integers and returns a String. */
	public static String toMixedNum(int num1, int num2) {
		if(num2 == 0) {
			throw new IllegalArgumentException
				("denominator can not be negative");
		}
		int wholeNum = num1 / num2;
		int numerator = num1 % num2;
		return wholeNum + "_" + numerator + "/" + num2;
	}
	
	// A call that takes 3 integers and one letter and converts it to
	// the trinomial formula
	public static String foil(int num1, int num2, int num3, int num4, String letter) {
		int firstNum = num1 *num3;
		int secondNum = (num1 *num4) + (num2 * num3);
		int thirdNum = num2 * num4;
		return firstNum + letter + "^2 + " + secondNum + letter + " + " + thirdNum;
	}
	
	// inputs 2 integers and returns the common divisor
	public static boolean isDivisibleBy(int num1, int num2) {
		if(num2 == 0) {
			throw new IllegalArgumentException
				("denominator can not be 0");
		}
		
		if(num1 % num2 == 0) {
			return true;
		} else { 
			return false;
		}
	}
	
	// gets a double and returns the absolute value of it
	public static double absValue(double num1) {
		if( num1 >= 0 ) {
			return num1;
		} else {
			return num1 - (2 * num1);
		}
	}
	
	// gets 2 doubles and returns the largest number
	public static double max(double num1, double num2) {
		if(num1 > num2) {
			return num1;
		} else if(num2 > num1) {
			return num2; 
		} else {
			return num1;
		}
	}
	
	// overload of max, gets 3 double and
	// returns the largest number
	public static double max(double num1, double num2, double num3) {
		if(num1 > num2 && num1 > num3) {
			return num1;
		} else if(num2 > num1 & num2 > num3) {
			return num2;
		} else {
			return num3;
		}
	}
	
	//A method thats gets 2 integers and
	// returns the smallest number
	public static int min(int num1, int num2) {
		if(num1 < num2) {
			return num1;
		} else if(num2 < num1) {
			return num2;
		} else {
			return num1;
		}
	}
	
	//round2 calls for a double and rounds that number
	// to the hundredth place
	public static double round2(double num1) {
		double round = 0;
		round = (num1 * 100) + 0.5;
		if(num1 < 0) {
			round -= 1;
		}
		int rounded = (int) round;
		double rounded2 = (double) rounded;
		rounded2 = rounded2 / 100;
		return rounded2;
	}
	
	// This methods calls for a double and the (integer)exponent
	// then returns the value after multiplying it
	public static double exponent(double num1, int exp) {
		if(exp <= 0) {
				throw new IllegalArgumentException
					("exponent cannot be negative or 0");
		}
		double multiply = 1;
		for (int i = 0; i < exp; i++) {
			multiply = multiply * num1;
		}
		return multiply;
	}
	
	//A method that calls for a integer and returns
	// its factorial
	public static int factorial(int num) {
		if(num < 0) {
			throw new IllegalArgumentException
				("number can not be negative");
		}
		
		int number = 1;
		for(int num1 = num; num1 >= 1; num1--) {
			number = number * num1;
		}
		
		return number;
	}
	
	// This method gets a input and returns a boolean
	// showing whether that number is a prime or not
	public static boolean isPrime(int num1) {
		int divide;
		for(divide = 2; divide < num1; divide++) {
			if(num1 % divide == 0) {
				return false;
			}
		}
		return true;
	}
	
	// A method that gets 2 integers and return the
	// greatest common factor
	public static int gcf(int num1, int num2) {	
		int divisible = 0;
		for(divisible = num1; divisible != 1; divisible--) {
			if(num1 % divisible == 0 && num2 % divisible == 0) {
				return divisible;
			}
		}
		
		return divisible;
	}
	
	// A method that calls for a double and returns 
	// the square root of that number
	public static double sqrt(double num1) {
		if(num1 < 0) {
			throw new IllegalArgumentException
			("Can't put negative number");	
		}
		
		double sqrt = 0;
		for(double i = 0; i * i <= num1; i+=0.001) {
			sqrt = i;
		}
		return round2(sqrt);
	}
	
	//A method that calls for 3 integers and runs it
	// through the quadratic formula and returns its results
	public static String quadForm(int num1, int num2, int num3) {
		double roots = discriminant(num1, num2, num3);
		System.out.println(roots);
		
		if (roots < 0) {
			return "no real roots";
		} else if(roots == 0) {
			double root0 = -(num2) / (2 *num1);
			return root0 + "";
		} else if(roots > 0) { 
			double roots2;
			roots2 = -(num2) - sqrt(roots);
			roots2 = (roots2) / (2 * num1);
			
			double roots3;
			roots3 = -(num2) + sqrt(roots);
			roots3 = (roots3) / (2 * num1);

			return Double.toString(roots3) + " and " + Double.toString(roots2);
		}	
		return "";
	}
}
