
abstract class Animal{
    Animal(){ // abstract class can have non-abstract methods
        System.out.println("All Animals ... !");
    }
    public abstract void sound(); // abstract class having abstract method. And Abstract method doesn't have body.
}

class Dog extends Animal{
//    Dog(){
//        super();
//    }
    public void sound(){
        System.out.println("Dog is Barking");
    }
}

class Tiger extends Animal{
    public void sound(){
        System.out.println("Tiger Roars");
    }
}

public class Abstraction_13 {
    public static void main(String[] args) {
        Dog d = new Dog();
        Tiger t = new Tiger();

        d.sound();
        t.sound();
    }
}
