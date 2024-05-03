
class Test{
    void show(){
        System.out.println("Unique Reference Id of Test Class using This Keyword : " + this);
    }

    int a;

    Test(){
        // 4) "this" keyword also calls parameterized constructor of its own class.
        this("Rohan");

        System.out.println("Default Constructor");
    }

    Test(String name){
        System.out.println(name);
    }
    Test(int a){
        this(); // 3) calls default constructor
        this.a = a;
    }

    void display(){
        System.out.println(a);
    }
}

public class ThisKeyword_9 {
    public static void main(String[] args) {
        Test obj = new Test(100);
        System.out.println("Unique Reference Id of Test Class using Object Reference : " + obj);
        obj.show();

        obj.display();

        // 3) "this" keyword is also used when we want to call the default constructor of its own class.


    }
}
