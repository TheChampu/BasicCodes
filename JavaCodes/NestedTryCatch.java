public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            // Outer try block
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);  // This will throw an ArrayIndexOutOfBoundsException

            try {
                // Inner try block
                String str = null;
                System.out.println(str.length());  // This will throw a NullPointerException
            } catch (NullPointerException e) {
                System.out.println("Inner catch block: " + e);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch block: " + e);
        }
    }
}
//Shivanshu Deo