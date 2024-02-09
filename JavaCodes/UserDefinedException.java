// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        try {
            validateInput(-5);  // This will throw CustomException
        } catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        }
    }

    // Method that throws a user-defined exception
    private static void validateInput(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("Input cannot be negative");
        }
        System.out.println("Input is valid: " + value);
    }
}
//Shivanshu Deo