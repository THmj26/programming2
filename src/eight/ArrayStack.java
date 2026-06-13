package eight;

import three.EmptyStackException;

public class ArrayStack implements Stack{
    private final static int SIZE = 10;
    private int[] stk;
    private int top = -1;

    ArrayStack(){stk=new int[SIZE];}
    ArrayStack(int l){stk=new int[l];}

    public int lunghezza(){return stk.length;}

    public void push(int a){
        stk[++top]=a;
    }

    public int pop() throws EmptyStackException {
        if (top==-1){
            throw new EmptyStackException();
        }
        return stk[top--];
    }

    public boolean is_empty(){
        return top==-1;
    }
}
