package paymenttask;

public class payment {
    private float amount;
    public IauthorizeBehavior authorizebehavior;
    private IprintBehavior printBehavior;
    
    public void setBehavior(IprintBehavior printBehavior){
        this.printBehavior = printBehavior;    
    }
    
    public IprintBehavior printBehavior(){
        return printBehavior;     
    }
    
    public void printRec() {
        printBehavior.printReceiot(amount);
    }

    public void setAuthorize(IauthorizeBehavior authorizebehavior){
        this.authorizebehavior = authorizebehavior;    
    }
 
    public String authorized() {
       return authorizebehavior.authorized();
    }
     
    public void setAmount(float amount) {
    this.amount = amount;
    }
    
    public float getAmount() {
        return amount;
    }
    
        
    
}
