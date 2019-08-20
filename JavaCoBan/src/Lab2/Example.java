package Lab2;

class Dog{
    String name;
    int age;
    String color;


    public Dog(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String waggingTheTail(String name){
        return name + " is wagging the tail.";
    }

    public String barking(String name){
        return name + " is barking.";
    }

    public String eating(String name){
        return name + " is eating.";
    }

public static void main(String[] args) {
    Dog a = new Dog("A", 3, "black");
    System.out.print(a.barking(a.name));
    Dog b = new Dog("B", 2, "red");
    Dog c = new Dog("C", 1, "yellow");
}
}
