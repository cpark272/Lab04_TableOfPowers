import java.util.Scanner;

public class Lab04Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Outputs the title of the program
		System.out.println("Learn your squares and cubes!");
		String userInput = null;
		
		do {
		
			// Prompt user to enter integer
			System.out.print("\nEnter an integer: ");
			int x = scan.nextInt();
			
			
			// Outputs the table of squares and cubes
			
			// Sets the table
			System.out.println("\nNumber    Squared    Cubed");
			System.out.println("======    =======    ======");
			
			// For loop to output the results
			for (int i = 1; i <= x; i++) {
				
				// Calculates the square of the integer
				int square = (int)Math.pow(i, 2);
			
				// Calculates the cube of the integer
				int cube = (int)Math.pow(i, 3);
			
				// Uses printf to format each row of the output
				System.out.printf("%-10d%-11d%-6d\n", i, square, cube );
			}
		
			// Asks if the user wants to continue the program
			System.out.print("\nContinue? (y/n): ");
			userInput = scan.next();
			
		} while (userInput.equals("y"));

		scan.close();
		
	}

}
