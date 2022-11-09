public class Flying extends Bird {



    private final String typeMovement;

    public Flying(String typeMovement, String enviroment,String nickname,int age){
        super(nickname,enviroment,age);
        this.typeMovement = typeMovement;
    }
    public void fly () {
        System.out.println("");
    }
    @Override
    public void eat() {

    }

    @Override
    public void go( ) {

    }

    @Override
    public String toString() {
        return "Flying{" +
                "typeMovement='" + typeMovement + '\'' +
                '}';
    }
}
