package a2_working_files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String data = """
                    id,first_name,last_name,email,gender
                    1,Fanchette,Williamson,fwilliamson0@github.com,F
                    2,Aleksandr,Matts,amatts1@webs.com,M
                    3,Maurie,Cordero,mcordero2@google.co.jp,M
                    4,Donnajean,Crowson,dcrowson3@google.com.hk,F
                    5,Ricardo,Gofton,rgofton4@nytimes.com,M
                    6,Gabie,Tregenna,gtregenna5@guardian.co.uk,F
                    7,Marjorie,Blumsom,mblumsom6@joomla.org,F
                    8,Lester,Huyghe,lhuyghe7@jugem.jp,M
                    9,Merrily,Stangoe,mstangoe8@tiny.cc,F
                    10,Reider,Karel,rkarel9@github.io,M
                    11,Dory,Jolliff,djolliffa@wufoo.com,F
                    12,Homerus,Averay,haverayb@skyrock.com,M
                    13,Alyda,Muglestone,amuglestonec@is.gd,F
                    14,Pinchas,Louca,ploucad@google.es,M
                    15,Cherin,Eltringham,celtringhame@parallels.com,F
                    16,Mufi,Rothert,mrothertf@dropbox.com,F
                    17,Jordana,Everex,jeverexg@ucla.edu,F
                    18,Belle,Rother,brotherh@auda.org.au,F
                    19,Clevie,Sifflett,csiffletti@furl.net,M
                    20,Gretchen,Abell,gabellj@1688.com,F
                """;

        String filePath = "src/data.csv";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(data);
            writer.close();
            System.out.println("File created successfully");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        List<Person> personList = new ArrayList<>();
        try {

            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String headerLine = reader.readLine();

            String line;
            while ((line = reader.readLine()) != null){
                String[] fields = line.trim().split(",");
                int id = Integer.parseInt(fields[0]);
                String firstName = fields[1];
                String lastName = fields[2];
                String email = fields[3];
                String gender = fields[4];

                Person person = new Person(id,firstName,lastName,email,gender);
                personList.add(person);
            }
            reader.close();
        }catch (IOException e){
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
        System.out.println(personList);
    }
}
