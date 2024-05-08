
class Shape{
    void draw(){
        System.out.println("Can't Say Shape Type");
    }
}

class Square extends Shape{

    @Override
    void draw(){
        // in order to access super class methods in Method Overriding, we have to use super keyword inside sub class's draw method
        super.draw();

        System.out.println("Square Shape");
    }

    void display(){
        System.out.println("Hello I am Square");
    }
}

public class MethodOverriding_11 {
    public static void main(String[] args) {
        // Object is sub class's object and object references to Super class (Shape)
        Shape obj = new Square();
        obj.draw();

        // below gives compilation error because obj references to super class (not sub class)
//        obj.display();
    }
}
