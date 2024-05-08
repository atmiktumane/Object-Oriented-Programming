
abstract class Programming{
    public abstract void developer();
    public abstract void rank();
}

class Html extends Programming{
    @Override
    public void developer(){
        System.out.println("HTML Developer");
    }

    @Override
    public void rank(){
        System.out.println("3nd Rank\n");
    }
}

class Java extends Programming{
    @Override
    public void developer(){
        System.out.println("Java Developer");
    }

    // if we remove below rank() method code -> compiler will show error because Java Class (sub class) becomes abstract class.
    // Reason : Abstract methods must be overriden in sub classes otherwise sub classes will become abstract class.
    @Override
    public void rank(){
        System.out.println("2nd Rank");
    }
}

public class AbstractionPart2_14 { // Abstract Methods
    public static void main(String[] args) {
        // obj1 object created for Html class references to SuperClass (Programming)
        Programming obj1 = new Html();

        // obj2 object created for Java class references to Java Class
        Java obj2 = new Java();

        obj1.developer();
        obj1.rank();

        obj2.developer();
        obj2.rank();

    }
}
