public class ThreadDemo {
    public static void main(String[] args) {
        // Create a new thread using a lambda expression
        Thread thread1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " is running.");
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " has completed.");
        }, "MyThread1");

        // Start the thread
        thread1.start();

        // Check if the thread is alive
        System.out.println("Is " + thread1.getName() + " alive? " + thread1.isAlive());

        try {
            // Join the thread, wait for it to complete
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check if the thread is alive after joining
        System.out.println("Is " + thread1.getName() + " alive after joining? " + thread1.isAlive());

        // Get and set the thread priority
        System.out.println(thread1.getName() + " priority: " + thread1.getPriority());
        thread1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(thread1.getName() + " priority after setting to MAX_PRIORITY: " + thread1.getPriority());
    }
}
