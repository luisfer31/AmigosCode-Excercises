package a2_stream_map;

public class Person {
    private int age;
    private String firstName;
    private String lastName;
    private String email;
    private Gender gender;

    public Person(int age, String email, Gender gender) {
        this.age = age;
        this.email = email;
        this.gender = gender;
    }

    public Person(int age, String firstName, String lastName, String email, Gender gender) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
