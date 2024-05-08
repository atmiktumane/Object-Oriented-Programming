
abstract class Fruits{
    public abstract void taste();
    public abstract void color();
}

abstract class Apple extends Fruits{
    @Override
    public void taste(){
        System.out.println("Sweet Taste");
    }
}

class Banana extends Apple{ // Banana SubClass has color() method + taste() method's properties also from its SuperClass Apple
    @Override
    public void color(){
        System.out.println("Yellow Color");
    }
}

public class AbstractionPart3_15 {
    public static void main(String[] args) {
        // obj Object created for Banana Class, references to BananaClass
        // but object can also references to its SuperClass(Apple or even Fruits) without any error and output change
        Banana obj = new Banana();
        obj.taste();
        obj.color();
    }
}
