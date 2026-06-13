package six;

public class IntVar1 implements IntVar{
    private int val = 0;
    public int get(){
        return val;
    }
    public void assign(int val){
        this.val=val;
    }
    public void extraJunk(){
        System.out.println(55);
    }
}
