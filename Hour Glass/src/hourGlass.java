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
		
<<<<<<< HEAD
		for(int line = 0; line < size/2 - 1; line++) {
			int space = 0;
=======
		//top
		for(int line = 0; line < size/2 - 1; line++) {
			int space = 0;
			
			//for loop does the spaces
>>>>>>> branch 'master' of https://github.com/Jamin-Chan/APCSFall2019Period4.git
			for(space = 0; space < line + 1; space++) {
				System.out.print(" ");
			}

			System.out.print("\\");
			
<<<<<<< HEAD
			for(int semi = 0; semi + space + space < size; semi++) {
				System.out.print(":");
			}
=======
			// loop does the colons
			for(int colon = 0; colon + (space*2) < size; colon++) {
				System.out.print(":");
			}
			
>>>>>>> branch 'master' of https://github.com/Jamin-Chan/APCSFall2019Period4.git
			System.out.println("/");
		}
		
<<<<<<< HEAD
		System.out.println("||");
		
		
=======
		// middle
		for(int i = 0; i < size/2; i++) {
			System.out.print(" ");
		}
		System.out.println("||");
		
		//bottom
		for(int line = 0; line < size/2 - 1; line++) {
			int space = 0;
			
			for(space = 0; space < (size/2) - (line + 1); space++) {
				System.out.print(" ");
			}
			System.out.print("/");
			
			//bottom colon
			for(int colon = size ; colon > (space *2) ; colon--) {
				System.out.print(":");
				
			}
			
			System.out.println("\\");
		}
		
		System.out.print("|");
		for(int quote = 1; quote <= size; quote++) {
			System.out.print("\"");
		}
		System.out.println("|");
>>>>>>> branch 'master' of https://github.com/Jamin-Chan/APCSFall2019Period4.git
		
		userInput.close();
	}
}
