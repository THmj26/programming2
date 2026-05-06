package fifteen;

import java.util.Random;
public class Doll extends Thread {
        /*
    Essentially, a doll inserts herself (as an object) in the ball's
    queue and waits (using herself as monitor!!!) till a guy wakes
    her up. This is repeated till the end of the ball.
     */

    public Doll (String nome) {
        super();
        setName(nome);
    }

    public synchronized void sveglia () {
        notify();
    } // called by the guys

    @Override
    public synchronized void run() { // synchronized!
        Random random = new Random();
        try {
            for (int i = 0; i < Ball.maxdances; i++) {
                if (isInterrupted()) throw new InterruptedException();
                sleep(random.nextInt(50));
                Ball.queue.insert(this);
                wait();
                System.out.println(getName() + ": Oh my, that's a kiss!");
            }
        } catch (InterruptedException e) {
            System.out.println("bye guys!");
        }
    }
}