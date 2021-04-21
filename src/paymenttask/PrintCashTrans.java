package paymenttask;

public class PrintCashTrans implements IprintBehavior{
    @Override
    public void printReceiot(float amount){
        System.out.println("The amount transferred by Cash is :" + amount );
        
    }
    
}
