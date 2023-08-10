package a3_simple_person;

public class Main {
    public static void main(String[] args) {
        Person male = new Person("Luis", "Munoz","M","luis@gmail.com");
        Person female = new Person("Vale", "Munoz","F","vale@gmail.com");

        System.out.println("Male Person: ");
        System.out.println("Name: " + male.getFirstName());
        System.out.println("LasName: " + male.getLastName());
        System.out.println("Gender: " + male.getGender());
        System.out.println("Email: " + male.getEmail());
        System.out.println();
        System.out.println("Female Person: ");
        System.out.println("Name: " + male.getFirstName());
        System.out.println("LasName: " + male.getLastName());
        System.out.println("Gender: " + male.getGender());
        System.out.println("Email: " + male.getEmail());
    }
}
