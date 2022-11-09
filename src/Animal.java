import java.util.Objects;

public abstract class Animal {

    private String nickname;
    private int age;

    protected Animal(String nickname, int age) {
        if (nickname==null || nickname.isBlank()){
            this.nickname = "не определено";
        } else {
            this.nickname=nickname;
        }
        if (age<0){
            this.age= 1;
        } else {
            this.age = age;
        }
    }

    public abstract void eat();

    public abstract void go ();

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        if (nickname==null || nickname.isBlank()){
            this.nickname = "не определено";
        } else {
            this.nickname = nickname;
        }
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o==null || getClass() != getClass()){
            return false;
        }
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(nickname, animal.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, age);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        if (age<0){
            this.age= 1;
        } else {
            this.age = age;
        }



    }
}
