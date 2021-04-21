package paymenttask;

public class AuthorizedCredit1 implements IauthorizeBehavior {
    @Override
        public String authorized(){
            String s = "Authorize from Credit 1 ";
            return s;
        }
}
