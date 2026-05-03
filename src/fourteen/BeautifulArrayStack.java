package fourteen;

public class BeautifulArrayStack implements Stack {

    /* it implements the ADT of stacks of integers in a
    concurrent setting. It solves the problem discussed
    in UglyArrayStack by using wait (and notifyAll).
    */

    private int[] stk;
    private int top = -1;

    BeautifulArrayStack(int l) {
        stk = new int[l];
    }

    public boolean isEmpty () {
        return top == -1;
    }

    public boolean isFull () {
        return top == stk.length -1;
    }
//这里将整个函数包括起来 使得一次只有一个线程可以调用 就不会发生都过了筛选的情况
//并且这里的等待方法 用的是wait函数 这个函数可以在等待的时候释放锁
    public synchronized void push (int v) throws InterruptedException {
        // pushes an int on top of the stack if there is room
        // for it, otherwise it *waits* and then tries again.

        while (isFull())
            wait();

        System.out.println("pushing " + v);
        top = top + 1;
        stk[top] = v;
        notifyAll(); // why not just notify()?
    }


    public synchronized int pop () throws InterruptedException {
        // pops and returns the top element if it exists,
        // otherwise it *waits* and then tries again.

        while (isEmpty())
            wait();

        int result = stk[top];
        System.out.println("popping " + result);
        top = top - 1;
        notifyAll(); // why not just notify()?
        return result;
    }
}
