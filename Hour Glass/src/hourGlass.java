import java.util.Scanner;

public class hourGlass {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int size = userInput.nextInt();
		
		System.out.print("|");
		for(int quote = 1, quote <= size, quote++;) {
			System.out.print("\"");
		}
		System.out.println("|");
		
		for(int line = 1, line <= size, line++) {
			for(int space = 0, space < line, space++) {
				System.out.print(" ");
			}
		}
		
		userInput.close();
	}
}
