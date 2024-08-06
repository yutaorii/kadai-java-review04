package animal;

public class Human extends Animal {

    private String hobby;

    public String gethobby() {
        return hobby;
    }

    public void sethobby(String hobby) {
        this.hobby = hobby;
    }

    public Human(String name, int age, String hobby ) {
        super(name, age);
        this.hobby = hobby;

    }

    public void think() {

        System.out.println(" 私は " + hobby + " について考えています。 ");
    }
}
