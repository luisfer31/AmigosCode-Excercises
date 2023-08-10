package a5_questionnaire;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Questionnaire {
    private int id;
    private Date createAt;
    private List<Question> questions;

    public Questionnaire(int id) {
        this.id = id;
        this.createAt = new Date();
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void removeQuestion(Question question) {
        questions.remove(question);
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
