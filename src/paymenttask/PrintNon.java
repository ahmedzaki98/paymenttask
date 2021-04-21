package paymenttask;

public class PrintNon implements IprintBehavior {
    @Override
    public void printReceiot(float amount){
        System.out.println("There is no amount transferred");       
    }
}
