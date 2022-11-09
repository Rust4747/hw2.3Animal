public abstract class Mammal extends Animal {

    private String enviroment;
    private String movementSpeed;


    protected Mammal(String nickname,int age,String enviroment, String movementSpeed) {
        super(nickname,age);
        this.enviroment = enviroment;
        this.movementSpeed = movementSpeed;
    }
    public void walk() {
        System.out.println(" земля ");

    }

    @Override
    public void eat() {

    }

    @Override
    public void go() {

    }
}

