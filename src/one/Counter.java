package one;

public class Counter {
    int mystery=0;
    public void tic(){
        System.out.println("tic");
        mystery++;
    }
    public int get(){
        return mystery;
    }
}
