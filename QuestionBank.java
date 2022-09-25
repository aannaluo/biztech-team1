import java.util.ArrayList;
import java.util.List;

public class QuestionBank {
    private List<String> questions;
    private List<String> answers;


    public QuestionBank() {
        this.questions = new ArrayList<>();
        this.answers = new ArrayList<>();
    }

    public void addQuestion(String question) {
        questions.add(question);
    }

    public void delQuestion(String question) {

    }
}
