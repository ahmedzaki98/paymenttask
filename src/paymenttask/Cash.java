package paymenttask;

public class Cash extends payment {
    private float cashTendered;
    
    public Cash(float cashTendered){
        super();
        setAmount(cashTendered);
        setAuthorize(new AuthorizeNon());
        setBehavior( new PrintCashTrans());
        this.cashTendered = cashTendered;
    }
}
