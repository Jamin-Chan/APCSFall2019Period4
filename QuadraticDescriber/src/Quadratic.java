import java.util.Scanner;

public class Quadratic {
	public static String quadrDescriber(double a, double b, double c) {
		String description = "Description of graph:/ny = " + a + " x^2 + " + b + " x + "+ c + "/n/n";
		
		String direction = "Opens: ";
		if(a < 0) {
			direction += "Down/n";
		} else if(a > 0){
			direction += "Up/n";
		} else {
			direction = "Not a Quadratic/n";
		}
		
		double x = (-b) / 2*a;
		String axis = "Axis of Symmetry: " + x + "/n";
		
		String vertex = "Vertex: (" + x + ", " + (a*(x*x) + b*x + c) + ")/n";
		
		String xIntercept = "x-intercept(s): " + discriminant(a, b, c) + "/n";
		
		String yIntercept = "y-intercept: " + c + "/n";

		String keepGoing = "Do you want to keep going? (Type \"quit\" to end)/n";

		return description + direction + axis + vertex + xIntercept + yIntercept + keepGoing;
	}




/*sqrt
discrim
quad form
round2
*/
	
	public static double discriminant(double number1, double number2, double number3) {
		double discriminant = 0;
		discriminant = (number2 * number2) - (4 * number1 * number3);
		return discriminant;
	}
	
	public static double round2(double num1) {
		double round = 0;
		round = (num1 * 100) + 0.5;
		int rounded = (int) round;
		double rounded2 = (double) rounded;
		rounded2 = rounded2 / 100;
		return rounded2;
	}
	
	public static double sqrt(double num1) {
		if(num1 < 0) {
			throw new IllegalArgumentException
			("Can't put negative number");	
		}
				
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
	
	public static String quadForm(double num1, double num2, double num3) {
		double roots = discriminant(num1, num2, num3);
		System.out.println(roots);
		if(roots < 0 ){
			return "no real roots";
		} else if(roots == 0){
			double root0 = -(num2) / (2 *num1);
			return root0 + "";
		} else { 
			double roots2;
			roots2 = -(num2) - sqrt(roots);
			roots2 = (roots2) / (2 * num1);
		
			double roots3;
			roots3 = -(num2) + sqrt(roots);
			roots3 = (roots3) / (2 * num1);
	
			return roots2 + " and " + roots3;
		}
	}
}	
	
	
