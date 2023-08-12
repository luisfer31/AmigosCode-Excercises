package a1_person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Valentina", Gender.FEMALE),
                new Person("Liliana", Gender.FEMALE),
                new Person("Luis", Gender.MALE),
                new Person("Edward", Gender.MALE)
        );

//        List<Person> female = new ArrayList<>();
//        people.forEach(person -> {
//            boolean isGender = person.getGender().equals(Gender.FEMALE);
//            if (isGender){
//                female.add(person);
//            }
//        });


        List<Person> female = people.stream().filter(person -> person.getGender() == Gender.FEMALE).toList();
        female.forEach(System.out::println);
    }
}
