package sixteen;

import java.lang.reflect.*;

public class Violation {

    /*
    reflection allows violating private fields
     */

    public static void main(String[] args) throws Exception {

        ArrayStack s = new ArrayStack(10);
        s.push(31);
        s.push(32);
        s.push(33);

        // s.top = 1; // NO, top is private! ...however, using reflection...

        try {
            Class<?> C = s.getClass();
            Field f = C.getDeclaredField("top");
            f.setAccessible(true); // must inhibit access control!
            // C.getDeclaredField("top").setAccessible(true); // try this!
            f.set(s, 1);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("ciao");
            e.printStackTrace();
        }
        System.out.println(s.pop()); // one stack element missing!
    }

}
