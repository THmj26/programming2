package three;

public class ArrayStack {
    private final static int SIZE = 10;
    private int[] stk;
    private int top = -1;

    ArrayStack(){stk=new int[SIZE];}
    ArrayStack(int l){stk=new int[l];}

    public int lunghezza(){return stk.length;}

    public void push(int a){
        stk[++top]=a;
    }

    public int pop(){
        return stk[top--];
    }

}
