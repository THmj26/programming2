package three;

public class FullStackException extends Exception{
    public int value;
    FullStackException(int v){
        value=v;
    }
}
