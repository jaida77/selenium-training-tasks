public class ExerciseMULTITHREADING3{
    public static void main(String[] args) {
        // Create Thread1 using anonymous class
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread1: " + i);
                try {
                    Thread.sleep(1000); // 1-second delay
                } catch (InterruptedException e) {
                    System.out.println("Thread1 interrupted.");
                }
            }
        });

        thread1.start(); // Start Thread1

        try {
            thread1.join(); // Main thread waits for Thread1 to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        // After thread1 is done
        System.out.println("Main thread done.");
    }
}
