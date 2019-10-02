import java.util.Scanner;

public class ProccessingNumbers {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("how many numbers do you want?");
		int ammount  = userInput.nextInt();
		System.out.println("Minimum number?");
		int min = userInput.nextInt();
		System.out.println("Maximum number?");
		int max = userInput.nextInt();
		int num;
		int sum = 0;
		System.out.println("What are your numbers?");
		for(int i = 0; i <= ammount; i++) {
			num = userInput.nextInt();
			if(num % 2 == 0) { 
				System.out.println("even: " + num);
				sum += num;
			}
		}
		System.out.println("total evens: " + sum);
		userInput.close();
	}
}
