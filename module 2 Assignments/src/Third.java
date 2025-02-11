//Qus. Create a thread using lambda function

public class Third {
    public static void main(String[] args) {
        // Creating a thread using lambda expression
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread is running: " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        };

        // Creating a thread with the Runnable task
        Thread thread = new Thread(task);

        // Starting the thread
        thread.start();

        // Main thread
        System.out.println("Main thread is running");
    }
}
