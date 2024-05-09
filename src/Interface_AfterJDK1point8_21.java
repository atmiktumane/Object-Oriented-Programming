
interface A{
    void a1(); // public + abstract
    void a2(); // public + abstract

//    void a3(); // public + abstract

    default void a3(){ // default method in Interface
        System.out.println("May or may not Override in Implementing Classes");
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
    }
}
