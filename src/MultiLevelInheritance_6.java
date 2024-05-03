
class Super{
    int a,b,c;

    void addition(){
        a=10; b=3;
        c = a+b;

        System.out.println("Addition of two numbers : "+ c);
    }

    void subtraction(){
        a=10; b=4;
        c = a-b;
        System.out.println("Subtraction of two numbers : "+ c);
    }
}

class Sub1 extends Super{
    void multiplication(){
        a=10; b=6;
        c = a*b;
        System.out.println("Multiplication of two numbers : "+ c);
    }

    void division(){
        a=10; b=5;
        c = a/b;
        System.out.println("Division of two numbers : "+ c);
    }
}

class Sub2 extends Sub1{
    void remainder(){
        a=10; b=7;
        c = a%b;
        System.out.println("Remainder of two numbers : "+ c);
    }
}

public class MultiLevelInheritance_6 {
    public static void main(String[] args){
        Sub2 myObj = new Sub2();
        myObj.addition(); myObj.subtraction(); myObj.multiplication(); myObj.division(); myObj.remainder();
    }

}
