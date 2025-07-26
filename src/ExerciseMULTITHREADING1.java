public class ExerciseMULTITHREADING1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from Thread!");
            try {
                Thread.sleep(1000); // delay of 1 second (1000 ms)
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }

    public static void main(String[] args) {
    	ExerciseMULTITHREADING1 thread = new ExerciseMULTITHREADING1();
        thread.start(); // starts the thread and calls run()
    }
}
