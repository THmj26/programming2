package three;

public class ArrayStack2 {
    private final static int SIZE = 10;
    private int[] stk;
    private int top = -1;

    ArrayStack2(){stk=new int[SIZE];}
    ArrayStack2(int l){stk=new int[l];}

    public int lunghezza(){return stk.length;}

    public void push(int a) throws FullStackException {
        if(top==SIZE-1)
            throw new FullStackException(a);
        stk[++top]=a;
    }
    public int pop() throws EmptyStackException{
        if(top==-1)
            throw new EmptyStackException();
        return stk[top--];
    }


}
