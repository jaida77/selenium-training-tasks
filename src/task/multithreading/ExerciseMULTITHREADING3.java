package task.multithreading;

public class ExerciseMULTITHREADING3{
    public static void main(String[] args) {
      
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread1: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread1 interrupted.");
                }
            }
        });

        thread1.start();

        try {
            thread1.join(); 
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        
        System.out.println("Main thread done.");
    }
}
