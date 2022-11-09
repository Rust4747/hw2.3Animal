public class Herbivore extends Mammal{

    private final String foodType;

    public Herbivore(String foodType, String nickname,int age,String enviroment, String movementSpeed){
        super(nickname,age,enviroment,movementSpeed);
        this.foodType = foodType;
    }
    public void graze () {
        System.out.println("Африка");
    }
    @Override
    public void eat() {
        System.out.println("траву");

    }

    @Override
    public void go() {
        System.out.println("быстро бегают ");

    }

    @Override
    public String toString() {
        return "Herbivore{" +
                "foodType='" + foodType + '\'' +
                '}';
    }
}
