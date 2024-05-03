class Const{
    int a;
    String b;
    boolean c;

    Const(){ // default constructor : constructor with no parameter
        a = 0;
        b = "ball";
        c = true;
    }

    void display(){
        System.out.println(a + " " + b + " " + c);
    }

}

class A{
    int x, y;

    A(int a, int b){ // parameterized constructor
        x = a;
        y = b;
    }

    A(int a, String c){
        System.out.println(a + " " + c);
    }

    void display(){
        System.out.println(x + " " + y);
    }
}

class Demo1{
    int i;
    String k;

    Demo1(){
        i=10;
        k = "hello";

        System.out.println(i + " " + k);
    }

    Demo1(Demo1 myObj){
        i = myObj.i;
        k = myObj.k;

        System.out.println(i + " " + k);
    }
}

class Demo2{
    int d, e;

    Demo2(int a, int b){
        d = a;
        e = b;

        System.out.println(d + " " + e);
    }

    Demo2(Demo2 obj){
        d = obj.d;
        e = obj.e;

        System.out.println(d + " " + e);
    }
}

class Demo3{
    int a; double b; String c;

    private Demo3(){
        a = 10; b = 35.33; c = "private constructor";

        System.out.println(a+" "+b+" "+c);
    }

//    public static void main(String[] args) { // We can access Demo3() private constructor only in its class but we have to write main() method inside class
//        Demo3 obj1 = new Demo3();
//    }
}

class Demo4{
    int a; String b; float c; double d;

    Demo4(){
        a=2; b="world"; c=3.54f; d=66.53;
    }

    Demo4(int x){
        a=x;
    }

    Demo4(int k, float j){
        a=k; c=j;
    }

    Demo4(double y, String z){
        d=y; b=z;
    }

}

public class Constructor_2 {

    public static void main(String[] args) {

        // Default Constructor
//        Const myObj = new Const();
//        myObj.display();

        // Parameterized Constructor
//        A obj1 = new A(10, 22);
//        obj1.display();
//
//        A obj2 = new A(10, "atmik");


        // Copy Constructor
//        Demo1 obj3 = new Demo1(); // Default Copy Constructor
//        Demo1 obj4 = new Demo1(obj3);
//
//
//        Demo2 obj5 = new Demo2(4, 21);  // Parametirized Copy Constructor
//        Demo2 obj6 = new Demo2(obj5);


        // Private Constructor
//        Demo3 obj7 = new Demo3(); // Cannot access Demo3() constructor as it is private
                                  // We can access Demo3() private constructor only in its class but we have to write main() method inside class



        // Constructor Overloading : we can write this below 4 objects in Demo4 class using main() method
        Demo4 myObj1 = new Demo4();
        Demo4 myObj2 = new Demo4(34);
        Demo4 myObj3 = new Demo4(55, 11.23f);
        Demo4 myObj4 = new Demo4(66.77, "document");

        System.out.println(myObj1.a +" "+ myObj1.b +" "+ myObj1.c +" "+ myObj1.d);
        System.out.println(myObj2.a);
        System.out.println(myObj3.a +" "+ myObj3.c);
        System.out.println(myObj4.b +" "+ myObj4.d);

    }
}
