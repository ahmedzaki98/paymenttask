package paymenttask;
import java.util.Date;

public class Credit extends payment {
    private String name;
    private String type;
    private Date expDate;
    
    public Credit(float amount ,String name ,String type ,Date expDate){
        super();
        setAmount(amount);
        setBehavior( new PrintCashTrans());
        setAuthorize(new AuthorizedCredit1());
        setAuthorize(new AuthorizedCredit2());
        this.name = name;
        this.type = type;
        this.expDate = expDate;
    }

}
