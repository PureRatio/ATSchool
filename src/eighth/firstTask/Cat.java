package eighth.firstTask;

import eighth.thirdAndFourthTask.Animal;

public class Cat extends Animal {
    int age;
    String eyeColor;
    double weight;
    String coatColor;

    public Cat(int age, double weight, String eyeColor, String coatColor){
        this.age = age;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.coatColor = coatColor;
    }

    public Cat(int age, String eyeColor, double weight, String coatColor){
        this.age = age;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.coatColor = coatColor;
    }

    public Cat(int age, String eyeColor, String coatColor, double weight){
        this.age = age;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.coatColor = coatColor;
    }

    public Cat(double weight, int age, String coatColor, String eyeColor){
        this.age = age;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.coatColor = coatColor;
    }

    public Cat(String coatColor, int age, double weight, String eyeColor){
        this.age = age;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.coatColor = coatColor;
    }

    public Cat(String eyeColor, int age, String coatColor, double weight){
        this.age = age;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.coatColor = coatColor;
    }

    public Cat(double weight, String eyeColor, int age, String coatColor){
        this.age = age;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.coatColor = coatColor;
    }

    public Cat(String eyeColor, double weight, int age, String coatColor){
        this.age = age;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.coatColor = coatColor;
    }

    public Cat(String coatColor, String eyeColor, int age, double weight){
        this.age = age;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.coatColor = coatColor;
    }

    public Cat(double weight, String coatColor, String eyeColor, int age){
        this.age = age;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.coatColor = coatColor;
    }

    public Cat(String coatColor,double weight,  String eyeColor, int age){
        this.age = age;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.coatColor = coatColor;
    }

    public Cat(String coatColor, String eyeColor, double weight, int age){
        this.age = age;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.coatColor = coatColor;
    }

    @Override
    public String toString() {
        return "Возраст: " + age + "\n" + "Цвет глаз: " + eyeColor + "\n" + "Вес: " + weight + "\n" + "Цвет шерсти: " + coatColor;
    }
}
