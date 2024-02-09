import java.util.Scanner;

public class BoxVolumeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the box: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the box: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the box: ");
        double height = scanner.nextDouble();

        double volume = calculateBoxVolume(length, width, height);

        System.out.println("The volume of the box is: " + volume);

        scanner.close();
    }

    private static double calculateBoxVolume(double length, double width, double height) {
        return length * width * height;
    }
}
//Shivanshu Deo