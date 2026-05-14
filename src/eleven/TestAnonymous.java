package eleven;

public class TestAnonymous {
    /*
    Two ways of creating anonymous classes: extending a class or implementing an interface
     */

    public static void main(String[] args) {

        String hallo = "Hallo ";

        Readable <String> x = new MyReadable<String>("Bubu!") {
            /*
            Anonimous class: extends MyLeggibile<String>, redefining method get
            Notice: you can use a costructor with a parameter. It must obey the same
            restrictions as local classes: access to effectively final variables only...
            */

            public String get() {
                // hallo = hallo + hallo; // no: hallo must be effectively final
                System.out.print(hallo);
                return super.get(); // calls super get()
            }
        };

        Readable <Integer> y = new Readable<Integer>() {
            /*
            Anonymous class: implements interface Readable<Integer>
            Notice: when an anonymous class is defined from an interface
            only the default constructor can be used!
             */

            public Integer get() {
                return 42;
            }
        };

        System.out.println(x.get());
        System.out.println(y.get());

        Readable<String> z = () -> "expression ";
        System.out.println("a lambda " + z.get());
    }
}