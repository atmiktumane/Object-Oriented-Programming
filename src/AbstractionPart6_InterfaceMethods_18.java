
interface Clients{
    void webDesign(); // public + abstract
    void webDevelop(); // public + abstract
}

abstract class RahulTech implements Clients{ // 50% work done by RahulTech
    @Override
    public void webDesign(){
        System.out.println("Blue, Top Menu and 3 Dot buttons");
    }
}

class AryanTech extends RahulTech{ // Another 50% work done by AryanTech, by first inheriting the existing work of Rahul + webDevelop() by its own.
    public void webDevelop(){
        System.out.println("Used HTML, CSS, Javascript to develop website");
    }
}

public class AbstractionPart6_InterfaceMethods_18 {
    public static void main(String[] args) {
        // Creating an object for AryanTech which references to AryanTech class
        // In Abstract Class and Interface, we can give object reference to SuperClass or Interface which gives same output
        AryanTech obj = new AryanTech();
        obj.webDesign();
        obj.webDevelop();
    }
}
