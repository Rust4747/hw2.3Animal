public class Amphibian extends Animal {

    private String enviroment;


    protected Amphibian(String enviroment,String nickname,int age) {
        super(nickname,age);
        this.enviroment = enviroment;
    }
    public void hunt(){
        System.out.println("насекомые");
    }

    @Override
    public void eat() {
        System.out.println("насекомых");

    }

    @Override
    public void go() {
        System.out.println("в основном водная среда");

    }
}
