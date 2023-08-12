package a1_person;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private Gender gender;

    public Person(String firstName, Gender gender) {
        this.firstName = firstName;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
