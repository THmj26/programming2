package fourteen;

public class Popper extends Thread {
    // pops from a stack

    private Stack pila;

    public Popper (Stack pila) {
        this.pila = pila;
    }

    @Override
    public void run() {
        try {
            pila.pop();
        } catch (InterruptedException e) {
            System.out.println("was sleeping...");
        }
    }
}
