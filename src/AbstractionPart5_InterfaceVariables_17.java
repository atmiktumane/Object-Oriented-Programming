
interface customerRaj{
    int amt = 5;  // public + static + final
    void purchase(); // public + abstract
}

class sellerSanju implements customerRaj{
    @Override
    public void purchase(){
//        amt = 7; // we cannot update value of amt variable as it is final by default in customerRaj interface
        System.out.println("Raj needs "+ amt + " Kg Rice");
    }
}

public class AbstractionPart5_InterfaceVariables_17 {
    public static void main(String[] args) {
        customerRaj obj = new sellerSanju();
        obj.purchase();

        System.out.println(customerRaj.amt); // amt variable is static that's why we can access here
    }
}
