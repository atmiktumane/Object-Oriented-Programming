
interface AnimalS{
    void show();
}

interface VehicleS{
    void disp();
}

class KshitijS implements AnimalS, VehicleS{
    public void show(){
        System.out.println("Kshitij has Animals");
    }

    // if KshitijS class don't have show() or disp(), then KshitijS class will become Abstract Class
    // because of the rule of Abstraction and Interface that sub class should have all abstract methods of its super class or interfaces from which it will be implemented
    public void disp(){
        System.out.println("Kshitij has Vehicles");
    }

}

public class MultipleInheritance_Part2_19 {
    public static void main(String[] args) {
        KshitijS obj = new KshitijS();

        obj.show();
        obj.disp();
    }
}
