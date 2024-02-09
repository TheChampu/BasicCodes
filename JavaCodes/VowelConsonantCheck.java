import java.util.Scanner;

public class VowelConsonantCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char alphabet = scanner.next().charAt(0);

        checkVowelOrConsonant(alphabet);

        scanner.close();
    }

    private static void checkVowelOrConsonant(char alphabet) {
        switch (Character.toLowerCase(alphabet)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(alphabet + " is a vowel.");
                break;
            default:
                System.out.println(alphabet + " is a consonant.");
                break;
        }
    }
}
//Shivanshu Deo