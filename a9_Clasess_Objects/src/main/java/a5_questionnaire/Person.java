package a5_questionnaire;

import java.util.Date;

public class Person {
    private String name;
    private String email;
    private Date dob;

    public Person(String name, String email, Date dob) {
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Date getDob() {
        return dob;
    }
}
