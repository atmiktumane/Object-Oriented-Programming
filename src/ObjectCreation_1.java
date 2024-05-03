
class Demo{
    int a = 10;
    String b = "practice";

    void show(){
        System.out.println(a+ " " + b);
    }

}
public class ObjectCreation_1 {
    public static void main(String[] args){
        Demo objName = new Demo();
        objName.show();
    }
}
