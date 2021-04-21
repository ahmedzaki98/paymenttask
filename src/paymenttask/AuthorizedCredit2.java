package paymenttask;

public class AuthorizedCredit2 implements IauthorizeBehavior {
    @Override
        public String authorized(){
            String s ="Authorize from Credit 2 ";
            return s;
        }
}
