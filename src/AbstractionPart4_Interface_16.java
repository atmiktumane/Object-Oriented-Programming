import java.util.Scanner;

interface Client{ // Client's Requirements
    void input(); // public + abstract

    void output(); // public + abstract
}

class Implementation implements Client{ // Implementation details are hidden from users
    String name;
    Double salary;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UserName: ");
        name = sc.nextLine();

        System.out.println("Enter Salary: ");
        salary = sc.nextDouble();
    }
    public void output(){
        System.out.println("Output : "+ name + " " + salary);
    }
}

public class AbstractionPart4_Interface_16 {
    public static void main(String[] args) {
        // obj Object create for Implementation SubClass, references to Implementation Class
        // but obj object can refer to Client interface also like -> Client obj = new Implementation();
        Implementation obj = new Implementation();

        obj.input();
        obj.output();
    }
}
