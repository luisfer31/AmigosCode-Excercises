import email.EmailValidator;

public class MainEmail {
    public static void main(String[] args) {
        EmailValidator validator = new EmailValidator();
        String email1 = "luism@gmail.com";
        String email2 = "luismgmail.com";
        boolean isValid1 = validator.isValidEmail(email1);
        boolean isValid2 = validator.isValidEmail(email2);
        System.out.println("Email: " + email1 + " is valid? = " + isValid1);
        System.out.println("Email: " + email2 + " is valid? = " + isValid2);
    }
}
