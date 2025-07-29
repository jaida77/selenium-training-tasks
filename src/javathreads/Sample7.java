package javathreads;

class Chat {
    boolean flag = false;

    public synchronized void Question(String msg) {
        if (flag) { // wait if it's not the question's turn
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Question: " + msg);
        flag = true;
        notify();
    }

    public synchronized void Answer(String msg) {
        if (!flag) { // wait if it's not the answer's turn
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Answer: " + msg);
        flag = false;
        notify();
    }
}

class Task3 implements Runnable {
    Chat m;
    String[] questions = { "Hi", "I'm good, what about you?", "Great!" };

    public Task3(Chat m) {
        this.m = m;
        new Thread(this, "Question").start();
    }

    public void run() {
        for (int i = 0; i < questions.length; i++) {
            m.Question(questions[i]);
        }
    }
}

class Task4 implements Runnable {
    Chat m;
    String[] answers = { "How are you?", "I'm fine", "Okay bye!" };

    public Task4(Chat m) {
        this.m = m;
        new Thread(this, "Answer").start();
    }

    public void run() {
        for (int i = 0; i < answers.length; i++) {
            m.Answer(answers[i]);
        }
    }
}

public class Sample7 {
    public static void main(String[] args) {
        Chat chat = new Chat();
        new Task3(chat);
        new Task4(chat);
    }
}
