import java.util.Scanner;

public class hourGlass {
	public static void main(String[] args) {
		System.out.println("How Big?");
		Scanner userInput = new Scanner(System.in);
		int size = userInput.nextInt();
		System.out.println();
		
		System.out.print("|");
		for(int quote = 1; quote <= size; quote++) {
			System.out.print("\"");
		}
		System.out.println("|");
		
		for(int line = 0; line < size/2 - 1; line++) {
			int space = 0;
			for(space = 0; space < line + 1; space++) {
				System.out.print(" ");
			}

			System.out.print("\\");
			
			for(int semi = 0; semi + space + space < size; semi++) {
				System.out.print(":");
			}
			System.out.println("/");
		}
		
		System.out.println("||");
		
		
		
		userInput.close();
	}
}
