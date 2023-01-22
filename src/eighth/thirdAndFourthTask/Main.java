package eighth.thirdAndFourthTask;

import eighth.firstTask.Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(4, "зелёный", "белый", 5.2d);
        Animal.testStaticMethod();
        Cat.testStaticMethod();
        cat.testStaticMethod();

        System.out.println(Animal.planet);
        Animal.planet = "Луна";
        System.out.println(cat.planet);
    }
}
