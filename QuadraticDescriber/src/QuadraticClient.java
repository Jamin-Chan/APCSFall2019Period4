import java.util.Scanner;

public class QuadraticClient {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		boolean quit = false;
		while(quit == false) {
			System.out.print("a: ");
			double a = userInput.nextDouble();
			System.out.print("b: ");
			double b = userInput.nextDouble();
			System.out.print("c: ");
			double c = userInput.nextDouble();
			System.out.println(Quadratic.quadrDescriber(a,b,c));
			
			String again = userInput.next();
				if(again.equals("quit")) {
					quit = true;
				}
			
		}
		userInput.close();
	}
	
}
