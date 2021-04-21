package paymenttask;

public class TestPayment {

    public static void main(String[] args) {
        Check C = new Check(1000, "ahmed","1234" );
        C.printRec();
        C.authorized();
    }
    
}
