public class Predator extends Mammal {

    private final String foodType;

    public Predator(String foodType, String nickname,int age,String enviroment, String movementSpeed){
        super(nickname,age,enviroment,movementSpeed);
        this.foodType = foodType;
    }
    public void hunt () {
        System.out.println("мясом");
    }
    @Override
    public void eat() {
        System.out.println("добычу");

    }

    @Override
    public void go() {
        System.out.println("земля ");

    }

    @Override
    public String toString() {
        return "Predator{" +
                "foodType='" + foodType + '\'' +
                '}';
    }
}
