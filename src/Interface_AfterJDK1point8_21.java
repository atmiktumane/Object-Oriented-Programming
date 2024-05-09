
/*  Default Method in Interface */

// Before JDK 1.8, Interface could only contain Abstract Method
// But due to some reason, Changes were made and After JDK 1.8, Interface can have Abstract Method + Default Method + Static Method


// Default method can be Override in Implementing Classes / Sub Classes
// Static Method in Interface cannot be Override in Implementing Classes.

// Note: static method in interface don't need Implementing Classes or object, Static method can directly be accessed in our main() method.
// If interface only have static method , then no need of implementing class , we can directly access Static method from interface in our main() method.
interface A{
    void a1(); // public + abstract
    void a2(); // public + abstract

//    void a3(); // public + abstract

    default void a3(){ // public + default  ->  default method in Interface
        System.out.println("May or may not Override in Implementing Classes");
    }

    static void show(){ // public + static ->  static method in Interface
        System.out.println("Cannot Override Static methods in Interface");
    }
}

class B implements A{
    public void a1(){
        System.out.println("Class B a1()");
    }
    public void a2(){
        System.out.println("Class B a2()");
    }

    public void a3(){
        System.out.println("Override in Implementing Class B");
    }
}

class C implements A{
    public void a1(){
        System.out.println("Class C a1()");
    }
    public void a2(){
        System.out.println("Class C a2()");
    }
}

class D implements A{
    public void a1(){
        System.out.println("Class D a1()");
    }
    public void a2(){
        System.out.println("Class D a2()");
    }
}

public class Interface_AfterJDK1point8_21 {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();

        b.a1(); b.a2(); b.a3();
        c.a1(); c.a2(); c.a3();
        d.a1(); d.a2(); d.a3();

        // Directly access static method from Interface using Interface_name.static_method_name();
        A.show();
    }
}
