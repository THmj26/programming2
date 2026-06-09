package sixteen;

public class HuskyDog {

    private String name;

    public HuskyDog () {
        this.name = "Lokino";
    }

    public HuskyDog (String name) {
        this.name = name;
    }

    public void eatChicken () {
        System.out.println(name + ": chicken, I eat you!");
    }
    public void runAway () {
        System.out.println(name + ": runs like the wind!");
    }
}
