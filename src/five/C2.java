package five;

public class C2 extends C1{
    public int b=7;
    public int fourtytwo=42;

    public C2(int a,int b,int f){
        super(a);
        this.b=b;
        fourtytwo=f;
    }
    public void blorg () { // original method of class C2
        System.out.println("BLORG");
    }

    public void plus (String s) { // overload
        System.out.println(s);
    }

    public void plus () { // override
        System.out.println("C2: a + b = " + (a + this.b));
    }

    public void myFathersb () { // reads fild b of superclass C1
        System.out.println("note: super b = " + super.b);
    }
}
