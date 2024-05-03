
class SuperClass{
    void input(){
        System.out.print("Enter Your Name : ");
    }
}

class SubClass1 extends SuperClass{
    void show(){
        System.out.println("My Name is Ankit");
    }
}

class SubClass2 extends SuperClass{
    void display(){
        System.out.println("My Name is Rahul");
    }
}

public class HierarchicalInheritance_7 {
    public static void main(String[] args) {
        SubClass1 obj1 = new SubClass1();
        SubClass2 obj2 = new SubClass2();

        obj1.input();  obj1.show();

        obj2.input();  obj2.display();
    }

}
