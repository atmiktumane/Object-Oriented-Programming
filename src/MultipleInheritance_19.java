
interface Animals{
    void show(); // public + abstract
}

interface Vehicles{
    void show(); // public + abstract
}

class Kshitij implements Animals, Vehicles{
    public void show(){
        System.out.println("Kshitij has Animals and Vehicles");
    }
}

public class MultipleInheritance_19 {
    public static void main(String[] args) {
        // obj can have reference to both the interfaces (Vehicles and Animals)
        Kshitij obj = new Kshitij();
        obj.show();
    }
}
