import java.util.Scanner;

public class ProccessingNumbers {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("how many numbers do you want?");
		int ammount  = userInput.nextInt();
		System.out.println("What are your numbers?");
		int num;
		int sum = 0;
		int even;
		num = userInput.nextInt();
		if(num % 2 == 0) {
			sum += 1;
			even = num;
		}
		int min = num;
		int max = num;
		for(int i = 0; i < ammount-1; i++) {
			System.out.print("next number:");
			num = userInput.nextInt();
			if(num < min) {
				min = num;
			}
			if(num > max) {
				max = num;
			}
			if(num % 2 == 0) {
				sum += 1;
				
			}
		}
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("total evens: " + sum);
		userInput.close();
	}
}
