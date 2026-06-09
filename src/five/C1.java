package five;

public class C1 {
    public int a=1;
    public int b=2;

    public C1(int a){this.a=a;}
    public C1(int a,int b){this(a);this.b=b;}

    public void ciao(String s){System.out.println(s);System.out.println(b);}

    public void plus(){System.out.println("C1: a+b == "+(a+b));}
}
