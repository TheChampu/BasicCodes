import java.util.Random;

class RandomNumberGenerator extends Thread {
    private Random random = new Random();
    private SharedData sharedData;

    public RandomNumberGenerator(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    public void run() {
        try {
            while (true) {
                int randomNumber = random.nextInt(100); // Generating a random integer between 0 and 99
                sharedData.setNumber(randomNumber);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class SquareCalculator extends Thread {
    private SharedData sharedData;

    public SquareCalculator(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    public void run() {
        try {
            while (true) {
                int number = sharedData.getNumber();
                if (number % 2 == 0) {
                    int square = number * number;
                    System.out.println("Square of " + number + ": " + square);
                }
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class CubePrinter extends Thread {
    private SharedData sharedData;

    public CubePrinter(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    public void run() {
        try {
            while (true) {
                int number = sharedData.getNumber();
                if (number % 2 != 0) {
                    int cube = number * number * number;
                    System.out.println("Cube of " + number + ": " + cube);
                }
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class SharedData {
    private int number;

    public synchronized int getNumber() {
        return number;
    }

    public synchronized void setNumber(int number) {
        this.number = number;
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();

        // Creating three threads
        RandomNumberGenerator generator = new RandomNumberGenerator(sharedData);
        SquareCalculator squareCalculator = new SquareCalculator(sharedData);
        CubePrinter cubePrinter = new CubePrinter(sharedData);

        // Starting the threads
        generator.start();
        squareCalculator.start();
        cubePrinter.start();
    }
}
//Shivanshu Deo