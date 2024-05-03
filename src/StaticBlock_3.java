public class StaticBlock_3 {
    // static block executes first while loading class in JVM;  static block does not require object
    static {
        System.out.println("Static Block");
    }

    // instance block require objects to execute
    {
        System.out.println("Instance Block");
    }

    StaticBlock_3(){
        System.out.println("Default Constructor");
    }

}

class StaticPractice{
    public static void main(String[] args){
        StaticBlock_3 myObj = new StaticBlock_3();
    }
}
