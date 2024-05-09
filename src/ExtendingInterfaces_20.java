
interface Gill{ // Gill's Requirements are to get addition() operation
    void add();
}

interface Shubham extends Gill{
    // Shubham's requirements are to get addition and subtraction operation,
    // but Gill already have addition operation, so instead of writing add() method again in shubham interface, we will extend Gill interface in Shubham, so that Shubham will get both the operations
    void sub();
}

class Developer implements Shubham{
    public void add(){
        int a=20, b=30, c;
        c = a+b;
        System.out.println("Addition : " + c);
    }

    public void sub(){
        int a=10, b=5, c;
        c = a-b;
        System.out.println("Subtraction : " + c);
    }
}

public class ExtendingInterfaces_20 {
    public static void main(String[] args) {
        // obj references to Developer class and Shubham interface only but not Gill interface
        // because Shubham interface contains both add() and sub() but Gill interface contains only add(), so obj.sub() will give error if we have object references to Gill.

        Shubham obj = new Developer();
        obj.add();
        obj.sub();
    }
}
