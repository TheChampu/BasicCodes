import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
    private static final String[] WORDS = {"java", "hangman", "programming", "computer", "developer", "algorithm"};
    private static final int MAX_INCORRECT_GUESSES = 6;

    private String targetWord;
    private StringBuilder guessedWord;
    private StringBuilder incorrectGuesses;
    private int incorrectGuessCount;

    public HangmanGame() {
        targetWord = getRandomWord();
        guessedWord = new StringBuilder("_".repeat(targetWord.length()));
        incorrectGuesses = new StringBuilder();
        incorrectGuessCount = 0;
    }

    private String getRandomWord() {
        Random random = new Random();
        return WORDS[random.nextInt(WORDS.length)];
    }

    private void displayGameStatus() {
        System.out.println("Word: " + guessedWord);
        System.out.println("Incorrect guesses: " + incorrectGuesses);
        System.out.println("Incorrect attempts left: " + (MAX_INCORRECT_GUESSES - incorrectGuessCount));
    }

    private void makeGuess(char letter) {
        boolean isCorrectGuess = false;
        for (int i = 0; i < targetWord.length(); i++) {
            if (targetWord.charAt(i) == letter) {
                guessedWord.setCharAt(i, letter);
                isCorrectGuess = true;
            }
        }

        if (!isCorrectGuess) {
            incorrectGuesses.append(letter).append(" ");
            incorrectGuessCount++;
        }
    }

    private boolean isGameWon() {
        return guessedWord.indexOf("_") == -1;
    }

    private boolean isGameLost() {
        return incorrectGuessCount == MAX_INCORRECT_GUESSES;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Hangman!");
        displayGameStatus();

        while (!isGameWon() && !isGameLost()) {
            System.out.print("Enter a letter: ");
            char guess = scanner.next().charAt(0);

            if (Character.isLetter(guess)) {
                guess = Character.toLowerCase(guess);

                if (guessedWord.indexOf(String.valueOf(guess)) == -1 &&
                        incorrectGuesses.indexOf(String.valueOf(guess)) == -1) {
                    makeGuess(guess);
                    displayGameStatus();
                } else {
                    System.out.println("You've already guessed that letter. Try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a letter.");
            }
        }

        if (isGameWon()) {
            System.out.println("Congratulations! You guessed the word: " + targetWord);
        } else {
            System.out.println("Sorry, you ran out of attempts. The correct word was: " + targetWord);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        HangmanGame hangmanGame = new HangmanGame();
        hangmanGame.play();
    }
}
//Shivanshu Deo