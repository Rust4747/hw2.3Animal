public abstract class Bird extends Animal {

    private String enviroment;


    protected Bird(String enviroment,String nickname,int age) {
        super(nickname,age);
        this.enviroment = enviroment;
    }
    public void hunt(){
        System.out.println(" растительная пища, насекомые");
    }

    @Override
    public void eat() {


    }

    @Override
    public void go( ) {


    }

}
