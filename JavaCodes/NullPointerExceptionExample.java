public class NullPointerExceptionExample {

    public static void main(String[] args) {
        try {
            String str = null;

            // Attempt to get the length of a null string
            int length = str.length();

            System.out.println("Length of the string: " + length); // This line won't be reached
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
}
//Shivanshu Deo