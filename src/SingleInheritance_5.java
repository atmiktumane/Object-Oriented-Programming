
class Student{ // SuperClass / ParentClass
    int roll, marks;
    String name;

    protected void input(){
        System.out.println("Enter Roll, name and marks: ");
    }
}

class Atmik extends Student{  // SubClass / ChildClass
    void display(){
        roll=24; name="Atmik"; marks=88;
        System.out.println(roll + " " + name + " " + marks);
    }

//    public static void main(String[] args) {
//        Atmik r = new Atmik();
//        r.input();
//        r.display();
//    }
}


public class SingleInheritance_5 {
    public static void main(String[] args) {
        Atmik r = new Atmik();
        r.input();
        r.display();
    }
}
