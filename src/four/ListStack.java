package four;

import three.EmptyStackException;

public class ListStack {
    static int len =0;
    IntList head =null;

    public boolean is_empty () {
        // returns true if the stack is empty, false otherwise

        return len == 0;
    }

//    ListStack(IntList a) {
//        len++;
//        head =a;
//    }

    public void push(int a){
        head=new IntList(a,head);
    }
    //使用头插
    public int pop() throws EmptyStackException {
        if(len ==0)throw new EmptyStackException();

        int pop=head.head;
        head=head.tail;
        len--;
        return pop;
    }
}
