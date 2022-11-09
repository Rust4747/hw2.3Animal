public class Main {
    public static void main(String[] args) {


        Herbivore gazelle = new Herbivore("травоядная", "Газеле", 7, "Африка", "быстро");
        System.out.println(gazelle);
        gazelle.eat();
        gazelle.go();
        gazelle.graze();
        gazelle.walk();

        Herbivore giraffe = new Herbivore("травоядная", "Жираф", 5, "Африка", "медленно");
        System.out.println(giraffe);
        giraffe.eat();
        giraffe.go();
        giraffe.graze();
        giraffe.walk();

        Herbivore horse = new Herbivore("травоядная", "лошадь", 5, "везде", "быстро");
        horse.eat();
        horse.go();


        Amphibian frog = new Amphibian("вода-земля", "Лягушка", 3);
        frog.eat();
        frog.go();
        frog.hunt();
        System.out.println(frog);


        Predator tiger = new Predator("хищник","тигр",10,"Россия","быстрые");
        tiger.eat();
        tiger.go();
        tiger.walk();
        tiger.hunt();
        System.out.println(tiger);

        Predator bear = new Predator("хищник","медведь",20,"Россия","быстрые");
        bear.eat();
        bear.go();
        bear.walk();
        bear.hunt();
        System.out.println(bear);

        Predator hyena = new Predator("хищник","гиена",13,"Азия","быстрые");
        hyena.eat();
        hyena.go();
        hyena.walk();
        hyena.hunt();
        System.out.println(hyena);


        Nonflying peacock = new Nonflying()

    }


}




