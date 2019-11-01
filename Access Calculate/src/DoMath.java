
public class DoMath {

	public static void main(String[] args) {
		
		System.out.println("square :" + Calculate.square(12));
		System.out.println("cube :" + Calculate.cube(12));
		System.out.println("average :" + Calculate.average(12.4, 5.1));
		System.out.println("toDegrees :" + Calculate.toDegrees(3.14));
		System.out.println("toRadians :" + Calculate.toRadians(180));
		System.out.println("discriminant :" + Calculate.discriminant(1,2,3));
		System.out.println("toImproperFrac :" + Calculate.toImproperFrac(1, 2, 6));
		System.out.println("toMixedNum :" + Calculate.toMixedNum(6, 4));
		System.out.println("foil :" + Calculate.foil(12, 26, 61, 2, "x"));
		System.out.println("isDivisbleBy :" + Calculate.isDivisibleBy(64, 7));
		System.out.println("absValue :" + Calculate.absValue(5.21));
		System.out.println("max :" + Calculate.max(35.22, 6.32));
		System.out.println("max3 :" + Calculate.max(3.2, 6.32, 1.3));
		System.out.println("min :" + Calculate.min(3, 6));
		System.out.println("round2 :" + Calculate.round2(-1234.57600));
		System.out.println("exponent :" + Calculate.exponent(2, 3));
		System.out.println("factorial :" + Calculate.factorial(5));
		System.out.println("isPrime :" + Calculate.isPrime(4));
		System.out.println("gcf :" + Calculate.gcf(10, 13));
		System.out.println("sqrt :" + Calculate.sqrt(9));
		System.out.println("quadForm :" + Calculate.quadForm(1, -1, -6));
		
	}

}
