
class ClassName{
    int add(){
        int a=10, b=4, c;
        c = a+b;
        return c;
    }

    void add(int x, int y){
        int c = x+y;
        System.out.println(c);
    }

    void add(int x, double y){
        double c = x+y;
        System.out.println(c);
    }
}

public class MethodOverloading_10 {
    public static void main(String[] args) {
        ClassName obj = new ClassName();

        obj.add(20,10);
        obj.add(40, 10.0);

        int c = obj.add();
        System.out.println(c);
    }
}
