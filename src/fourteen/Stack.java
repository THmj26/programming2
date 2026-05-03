package fourteen;

public interface Stack {
    // a simple interface of stacks of integers

    void push(int v) throws InterruptedException;
    int pop () throws InterruptedException;
}