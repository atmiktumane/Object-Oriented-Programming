
class InstancePractice{
    int a, b;

    static void show(){
        System.out.println("Static Block executes first");
    }

    {
        a=30; b=44;
        System.out.println(a+ " "+ b);
    }

    InstancePractice(){ // Default Constructor
        a=11; b=22;
        System.out.println(a+ " "+ b);
    }

    void display(){
        a=88; b=99;
        System.out.println(a+ " "+ b);
    }
}

public class InstanceBlock_4 {
    public static void main(String[] args) {
        InstancePractice.show();

        InstancePractice myObj = new InstancePractice();
        myObj.display();

    }

}
