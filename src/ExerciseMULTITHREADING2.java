public class ExerciseMULTITHREADING2 implements Runnable {

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Count: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }

    public static void main(String[] args) {
    	ExerciseMULTITHREADING2 counter = new ExerciseMULTITHREADING2(); 
        Thread thread = new Thread(counter);            
        thread.start();                          
    }
}
