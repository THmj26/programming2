package eight;

public interface Int1 {
    default void print () {
        System.out.println("blah");
    }
    //Why do we need to write default signature explicitly?
    //because if we don't write it,it will be public.
}
