package one;

import javax.swing.*;
import java.net.SocketOption;

public class SillySum {
    static void main() {
        System.out.print("32 + 4 =");
        System.out.print(doIt(32,4));
    }
    public static int doIt(int a,int b){
        return a+b;
    }
}
