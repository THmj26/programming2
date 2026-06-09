package sixteen;

import java.lang.reflect.*;

public class TestAgent { // motivating example for reflection
    /*
    We want to write a program for testing homeworks. The homework requires
    implementing interface Agent. Typical mistakes are giving classes
    different names from the required (MyAgent), or not implementing
    the required methods (action)...
    Using reflection one can write a test program before any implementation
    is provided: errors which would normally be captired at compile time
    can now be treated at run time.
     */

    public static void main(String[] args) {

        //Agent x = new MyAgent("Knapp");
        //x.action();
        //x.nome = 9;
        /*
        here we need a class MyAgent in order to check if the main works.
        Or otherwise...
         */

        try {
            Class<?> C = Class.forName("sixteen.MyAgent");
            Type[] T = C.getGenericInterfaces();//获取该类中实现的所有的接口名称

            boolean found = false;
            for (Type t : T)
                // seeks "Agent" among the interfaces implemented by MyAgent
                if (t.getTypeName() == "Agent")//检查接口中有没有我们要求的那一个
                    found = true;
            if (!found)
                System.out.println("MyAgent must implement interface Agent");
            Method agisco = C.getMethod("action");//检查写的程序中有没有action这个程序

        } catch (ClassNotFoundException e) {
            System.out.println("Class MyAgent not provided!");//采用报错的方式来判断有没有
        } catch (NoSuchMethodException e) {
            System.out.println("Method action() not provided!");
        }
        System.out.println("all is well!");
    }
}