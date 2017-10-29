import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String userInput = "";
		String verifyPartic = "";

		System.out.println("Good day! Welcome to the Grand Circus Pig Latin Translator!");
		System.out.println("Would you like to translate a word? (y/n)");
		verifyPartic = scan.nextLine();
		// User input here, pretty straight forward

		// Here I set up the input verification and loop, so that the user will be
		// prompted to enter
		// words until they decide to opt out
		while (verifyPartic.equalsIgnoreCase("y")) {
			System.out.println("Great! Please enter a word to be translated: ");
			userInput = scan.nextLine();
			translateWord(userInput);
			// scan.nextLine();
			System.out.println("Would you like to translate another word?");
			verifyPartic = scan.nextLine();
		}
		System.out.println("Thanks for using the Grand Circus Pig Latin Translator!!!");
		scan.close();
	}

	public static void translateWord(String input) {

		String lowCase = input.toLowerCase();
		// These two lines set the user input to lower case, then isolate the first
		// character into a variable
		char firstLetter = lowCase.charAt(0);

		// This loop checks the firstLetter variable to see if it's a vowel. If it is,
		// it concats
		// "way" onto the word and returns it
		if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o'
				|| firstLetter == 'u') {

			String pigLatin = input.concat("way");
			System.out.println(pigLatin);
		} else {

			// This for loop checks every index place in the given word
			for (int i = 0; i < lowCase.length(); ++i) {
				char presentLetter = lowCase.charAt(i);

				// I then establish an if loop within the for loop that makes sure the program
				// checks
				// each character the for loop is going through to see if it's a vowel
				if (presentLetter == 'a' || presentLetter == 'e' || presentLetter == 'i' || presentLetter == 'o'
						|| presentLetter == 'u') {

					// When the program's parameters become true (finds a vowel) it then prints the
					// rest of the string here, concating whatever consonants came first as well
					// as adding the "ay" and the hyphen
					System.out.println(input.substring(i, input.length()) + "-" + input.substring(0, i) + "ay");
					break;
				}

			}

		}
	}

}
