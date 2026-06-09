package sixteen;

public class MyAgent implements Agent {
    // public class MyAgent {

    private String name;

    public MyAgent(String nome){
        this.name = nome;
    }

    @Override
    public void action () {
        System.out.println("Agent " + name + " ready!");
    }

    // @Override
    public void beSilly (){
        doNothing();
    }

    @Deprecated
    public void doNothing () {
    }
}
