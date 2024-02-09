class MyThreadMethods extends Thread {
    public void run() {
        System.out.println("Thread ID: " + Thread.currentThread().getId());
        System.out.println("Thread Name: " + Thread.currentThread().getName());

        // Checking if the thread is a daemon thread
        System.out.println("Is Daemon Thread? " + Thread.currentThread().isDaemon());

        // Sleeping for 2 seconds
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Displaying a message after sleeping
        System.out.println("Thread ID after sleep: " + Thread.currentThread().getId());
    }
}

public class ThreadMethodsExample {
    public static void main(String[] args) {
        MyThreadMethods thread = new MyThreadMethods();
        thread.setName("Shivanshu");

        // Starting the thread
        thread.start();

        // Waiting for the thread to finish
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Displaying the state of the thread
        System.out.println("Thread State: " + thread.getState());
    }
}
//Shivanshu Deo