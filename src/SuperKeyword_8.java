
class SuperZClass{
    int a = 10;

    void display(){
        System.out.println("SuperClass display() method");
    }

    SuperZClass(){
        System.out.println("SuperClass Default Constructor");
    }
}

class B extends SuperZClass{
    int a = 20;

    void show(){
        System.out.println(a);
        System.out.println(super.a);
    }

    void display(){
        super.display();
        System.out.println("SubClass display() method");
    }

    B(){
        // first B class Default constructor automatically calls SuperClass Default constructor
        super();  // -> this is hidden
        System.out.println("SubClass Default Constructor");
    }
}

public class SuperKeyword_8 {
    public static void main(String[] args) {
        B obj = new B(); // calls B class's default constructor
        obj.show();

        obj.display();
    }
}
