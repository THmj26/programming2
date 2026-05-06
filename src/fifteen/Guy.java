package fifteen;

import java.util.Random;

public class Guy extends Thread {
    /*
    Essentially, extracts a doll from the queue and kisses her,
    till the end of the ball. When extracting from the queue
    (if empty) it may go waiting on the ball's waiting room.
     */

    public Guy (String nome) {
        super();
        setName(nome);
    }

    private void baciaPupa (Doll P) {
        System.out.println( getName() + ": kissing " + P.getName());
        P.sveglia();
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            for (int i = 0; i < Ball.maxdances; i++) {
                if (isInterrupted()) throw new InterruptedException();
                sleep(random.nextInt(50));
                Doll mySweetHeart = Ball.queue.extract();
                baciaPupa(mySweetHeart);
            }
        } catch (InterruptedException e) {
            System.out.println("bye sweethearts!");
        }
    }
}