package paymenttask;

public class AuthorizeNon implements IauthorizeBehavior {
    @Override
        public String authorized(){
            return "No Authorize ";
        }
}
