package paymenttask;

public class Check extends payment {
    private String name;
    private String banckID;
    
    public Check(float amount ,String name, String banckID ){
        super();
        this.name = name;
        this.banckID = banckID;
        setAmount(amount);
        setAuthorize(new AuthorizeNon());       
        setBehavior(new PrintCashTrans());               
    }
    
}
