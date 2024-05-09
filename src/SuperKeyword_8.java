
class SuperZClass{
    int a = 10;

    void display(){
        System.out.println("SuperClass display() method");
    }

    SuperZClass(){
        System.out.println("SuperClass Default Constructor");
    }
}

class B1 extends SuperZClass{
    int a = 20;

    void show(){
        System.out.println(a);
        System.out.println(super.a);
    }

    void display(){
        super.display();
        System.out.println("SubClass display() method");
    }

    B1(){
        // first B1 class Default constructor automatically calls SuperClass Default constructor
        super();  // -> this is hidden
        System.out.println("SubClass Default Constructor");
    }
}

public class SuperKeyword_8 {
    public static void main(String[] args) {
        B1 obj = new B1(); // calls B1 class's default constructor
        obj.show();

        obj.display();
    }
}
