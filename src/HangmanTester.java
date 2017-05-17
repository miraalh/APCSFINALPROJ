import java.util.Scanner;

public class HangmanTester {
	public static void main (String []args){
		
		// computer creates word array for a randomly generated word
		Hangman hangman1 = new Hangman(); 
		
		//allows user to guess letters 
		Scanner sc = new Scanner (System.in);

		String guess;
		
		//check if the guess is in the word
		while (hangman1.getLives()>0){
			if (hangman1.getCorrectGuesses() != hangman1.getWordLength()){
				System.out.println("Type a letter below" +"\n"); 
				guess = sc.next(); 
				hangman1.checkGuess(guess); 
			}
			else {
				System.out.println("Congrats you won!");
				break; 
			}
		}

	}
}
