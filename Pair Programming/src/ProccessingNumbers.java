import java.util.Scanner;

public class ProccessingNumbers {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("how many numbers do you want?");
		int ammount  = userInput.nextInt();
		System.out.println("What are your numbers?");
		int num;
		int sum = 0;
		num = userInput.nextInt();
		int even = num;
		if(num % 2 == 0) {
			sum += 1;
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
				if(even < num) {
					even = num;
				}
			}
		}
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("total evens: " + sum);
		if(even % 2 == 0) {
			System.out.println("largest even number: " + even);
		}
		userInput.close();
	}
}
