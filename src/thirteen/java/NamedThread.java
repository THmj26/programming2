package thirteen.java;

public class NamedThread extends Thread {

    public static _4NamePrinter NP = new _4NamePrinter();

    public NamedThread(String name) {
        super(name);
    }

    public void run () {
        NP.printName();
    }
}