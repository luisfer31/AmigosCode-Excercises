package a5_questionnaire;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SurveyApp {
    public static void main(String[] args) {

        Questionnaire questionnaire = new Questionnaire(1);

        questionnaire.addQuestion(new Question("What is your favorite color?"));
        questionnaire.addQuestion(new Question("How often do you exercise?"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your email: ");
        String email = scanner.nextLine();

        System.out.println("Enter you date of birth (YYYY-MM-DD): ");
        String dobStr = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dob = null;
        try {
            dob = dateFormat.parse(dobStr);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Person person = new Person(name, email, dob);

        String[] answers = new String[questionnaire.getQuestions().size()];
        for (int i = 0; i < questionnaire.getQuestions().size(); i++) {
            System.out.println(questionnaire.getQuestions().get(i).getQuestionText() + ": ");
            answers[i] = scanner.nextLine();

        }
        saveAnswersToFile(person, answers);
        scanner.close();
    }

    private static void saveAnswersToFile(Person person, String[] answers) {
        String fileName = "survey_answers.txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.write("Name: " + person.getName() + "\n");
            writer.write("Email: " + person.getEmail() + "\n");
            writer.write("Date of Birth: " + person.getDob() + "\n");
            for (int i = 0; i < answers.length; i++) {
                writer.write("Question " + (i + 1) + ": " + answers[i] + "\n");
            }
            writer.write("\n");
            writer.close();

            System.out.println("Survey answers save to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while saving the survey answers.");
            e.printStackTrace();
        }
    }
}
