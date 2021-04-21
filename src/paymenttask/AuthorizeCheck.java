package paymenttask;

public class AuthorizeCheck implements IauthorizeBehavior {
        @Override
        public String authorized(){            
         return "Authorize Checking ";
        }
}
