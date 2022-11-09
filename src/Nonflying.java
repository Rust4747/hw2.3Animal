public class Nonflying extends Bird {

    private final String typeMovement;

    public Nonflying(String typeMovement, String enviroment,String nickname,int age){
        super(nickname,enviroment,age);
        this.typeMovement = typeMovement;
    }
    public void walk () {
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
        return "Nonflying{" +
                "typeMovement='" + typeMovement + '\'' +
                '}';
    }
}
