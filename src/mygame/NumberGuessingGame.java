//step 1: define the package
package mygame;

//step 2: import necessary classes
import java.util.Random;
import java.util.Scanner;

//Step 3: create the class
public class NumberGuessingGame {

	public static void main(String[] args) {
		// Generate a random number
		Random random = new Random();
		int numberToGuess = random.nextInt(10) + 1;

		// Create a scanner to read user input
		Scanner scanner = new Scanner(System.in);

		int attempts = 0;

		int userGuess = 0;

		while (userGuess != numberToGuess) { // loop until correct number
			System.out.print("Enter your guess (1-10):");
			userGuess = scanner.nextInt();
			attempts++;

			if (userGuess == numberToGuess) {
				System.out.println("🎉 Congratulations! You guessed the right number.");
				System.out.println("You guessed the right number in: " + attempts + " attempts. Really good job!!");
			} else if (userGuess < numberToGuess) {
				System.out.println("A little too low! Please try again, you are doing great.");
			} else {
				System.out.println("A little too high! Please try again, practice makes perfect.");
			}
		}

		scanner.close();
	}

}
