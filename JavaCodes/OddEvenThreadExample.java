class EvenNumberThread extends Thread {
    private int limit;

    public EvenNumberThread(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        System.out.println("Even Numbers up to " + limit + ":");
        for (int i = 2; i <= limit; i += 2) {
            System.out.println(i);

            try {
                // Sleep for a short duration to simulate some work
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class OddNumberThread extends Thread {
    private int limit;

    public OddNumberThread(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        System.out.println("Odd Numbers up to " + limit + ":");
        for (int i = 1; i <= limit; i += 2) {
            System.out.println(i);

            try {
                // Sleep for a short duration to simulate some work
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class OddEvenThreadExample {

    public static void main(String[] args) {
        int limit = 10; // You can change the limit as needed

        // Create instances of the custom threads
        EvenNumberThread evenThread = new EvenNumberThread(limit);
        OddNumberThread oddThread = new OddNumberThread(limit);

        // Start the threads
        evenThread.start();
        oddThread.start();
    }
}
//Shivanshu Deo