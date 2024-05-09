
/*  Private Method in Interface */
// Private Method in Interface can only be accessed using Default Method or Static Method inside Interface

interface A2{

    private static void add2(int m, int n){
        System.out.println("Sum of Two No. : "+ (m+n));
    }
    private void add(int x, int y){
        System.out.println("Sum of 2 Numbers : "+ (x+y));
    }

    default void call(int a, int b){ // public + default
        add(a, b);
    }

    static void call2(int a, int b){ // public + static
//        add(a, b); // gives error because static method call2() should not contain non-static method add()

        add2(a, b);
    }
}

class B2 implements A2{
    public void sub(int i, int j){
        System.out.println("Subtraction of 2 Numbers : "+ (i-j));
    }
}

public class Interface_AfterJDK1point9_22_PrivateMethods {
    public static void main(String[] args) {
        B2 obj = new B2();
        obj.sub(10, 5);

        obj.call(20, 5); // object obj created for B2 class which inherits implementation of call() method from A2 interface,
                                // and default method call() calls the private method add() in interface

        A2.call2(2, 4); // call2() is static method, so inside static method , there should be only static members or methods
    }
}
