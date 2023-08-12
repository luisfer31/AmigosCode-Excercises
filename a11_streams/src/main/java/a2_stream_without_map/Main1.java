package a2_stream_without_map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main1 {
    public static void main(String[] args) {
        String data = """
                    16,Fanchette,Williamson,fwilliamson0@github.com,F
                    26,Aleksandr,Matts,amatts1@webs.com,M
                    3,Maurie,Cordero,mcordero2@google.co.jp,M
                    45,Donnajean,Crowson,dcrowson3@google.com.hk,F
                    5,Ricardo,Gofton,rgofton4@nytimes.com,M
                    65,Gabie,Tregenna,gtregenna5@guardian.co.uk,F
                    37,Marjorie,Blumsom,mblumsom6@joomla.org,F
                    18,Lester,Huyghe,lhuyghe7@jugem.jp,M
                    39,Merrily,Stangoe,mstangoe8@tiny.cc,F
                    10,Reider,Karel,rkarel9@github.io,M
                    11,Dory,Jolliff,djolliffa@wufoo.com,F
                    32,Homerus,Averay,haverayb@skyrock.com,M
                    13,Alyda,Muglestone,amuglestonec@is.gd,F
                    14,Pinchas,Louca,ploucad@google.es,M
                    11,Cherin,Eltringham,celtringhame@parallels.com,F
                    2,Mufi,Rothert,mrothertf@dropbox.com,F
                    17,Jordana,Everex,jeverexg@ucla.edu,F
                    18,Belle,Rother,brotherh@gov.uk,F
                    19,Clevie,Sifflett,csiffletti@furl.net,M
                    20,Gretchen,Abell,gabellj@1688.com,F
                """;
        String[] dataPersons = data.trim().split("\n");
        String[] dataChucks = null;
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < dataPersons.length; i++) {
            dataChucks = dataPersons[i].trim().split(",");
            int age = Integer.parseInt(dataChucks[0]);
            String firstName = dataChucks[1];
            String lastName = dataChucks[2];
            String email = dataChucks[3];
            Gender gender = Gender.valueOf(dataChucks[4]);
            people.add(new Person(age, firstName, lastName, email, gender));
        }

        Stream<Person> searchPerson = people.stream()
                .filter(person -> person.getGender().equals(Gender.F))
                .filter(person -> person.getAge() >= 13 && person.getAge() <= 19)
                .filter(person -> person.getEmail().endsWith("gov.uk"));

        searchPerson.forEach(System.out::println);
    }
}
