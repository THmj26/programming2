package fourteen;

public class UglyArrayStack implements Stack {

    /* It implements tha ADT of stacks of integers in a
    concurrent setting. The critical parts of push and pop
    are synchronized. When a popper finds an empty stack it
    goes to sleep, and it does so *outside* the synchronized
    block. It won't work because in between test and stack
    uptate there may be interferences! Sleeping inside (that
    is declaring push and pop synchronized) won't work either,
    because sleep() does not release locks.
    */

    private int[] stk;
    private int top = -1;

    UglyArrayStack(int l) {
        stk = new int[l];
    }

    private void rest () throws InterruptedException {
        Thread.currentThread().sleep(100);
    }

    public boolean isEmpty () {
        return top == -1;
    }

    public boolean isFull () {
        return top == stk.length -1;
    }

//在这个不好的栈中 这里的pop和push函数 由于线程进行无序性的问题
//会导致两个线程都通过了空栈检查 而后A用完了之后释放锁 B再进去之后就导致扔出错误
//而且在这里线程的等待方法是让线程停一会 而不是真正的等待 这样会导致重复大量的多次检查的发生效率低下
//并且sleep并不会释放线程 所以有可能会导致出现死锁(线程一直占用锁 同时还一直沉睡 所以判断条件永远不可能为真)

    public void push (int v) throws InterruptedException {
        // pushes an int on top of the stack if there is
        // room for it, otherwise it *rests* and then tries again

        while (isFull())
            rest();

        // watch out here!!!

        synchronized (this) {
            System.out.println("pushing " + v);
            top = top + 1;
            stk[top] = v;
        }
    }

    public int pop () throws InterruptedException {
        // pops and returns the top element if it
        // exists, otherwise it *rests* ant then tries again

        while (isEmpty())
            rest();

        // watch out here!!!

        synchronized (this) {
            int result = stk[top];
            System.out.println("popping " + result);
            top = top - 1;
            return result;
        }
    }
}
