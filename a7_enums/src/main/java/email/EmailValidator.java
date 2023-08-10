package email;

public class EmailValidator {

    public boolean isValidEmail(String email){
        if (email==null||email.isEmpty()||!email.contains("@")){
            return false;
        }
        return true;
    }
}
