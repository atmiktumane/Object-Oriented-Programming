
class Capsule{
    private int value; // Data Hiding

    public void setValue(int x){ // Data Abstraction : To show user interface to user and hide implementation part
        value = x;
    }

    public int getValue(){
        return value;
    }
}

public class Encapsulation_12 {
    public static void main(String[] args) {
        Capsule myObj = new Capsule();

//    myObj.value = 10; // gives error because value is private variable

        myObj.setValue(100);

        System.out.println(myObj.getValue());
    }
}
