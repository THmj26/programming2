package fifteen;

public class SynchroQueue <E> {
    /*
    linked list implementation of queues for multithread use
    */

    protected MyListElem<E> first = null; // estracting from here
    protected MyListElem<E> last = null; // inserting from here

    public synchronized boolean isEmpty () {
        return (first == null);
    }

    public synchronized void insert (E elem) {
        // System.out.println("insert " + elem);

        if (isEmpty()) {
            first = last = new MyListElem<E>(elem);
            notifyAll();
        }
        else {
            last.next = new MyListElem<E>(elem);
            last = last.next;
        }
    }

    public synchronized E extract () throws InterruptedException {

        while (isEmpty())
            wait();

        E result = first.value;
        // System.out.println("extracting " + result);

        first = first.next;
        if (first == null) last = null;
        return result;
    }
}
