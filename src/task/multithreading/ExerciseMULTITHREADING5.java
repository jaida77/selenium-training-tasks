package task.multithreading;

class PriorityTask extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + 
                           " is running with priority " + 
                           Thread.currentThread().getPriority());
    }
}

public class ExerciseMULTITHREADING5 {
    public static void main(String[] args) {
        PriorityTask t1 = new PriorityTask();
        PriorityTask t2 = new PriorityTask();
        PriorityTask t3 = new PriorityTask();

   
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);  
        t2.setPriority(Thread.NORM_PRIORITY); 
        t3.setPriority(Thread.MAX_PRIORITY);   

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}
