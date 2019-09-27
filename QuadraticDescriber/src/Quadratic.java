
public class Quadratic {

	public static String quadrDescriber(double a, double b, double c) {

		//calculate al values and return string
		return "";
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
	
	public static String quadForm(int num1, int num2, int num3) {
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
	
	