import java.util.ArrayList;
import java.util.List;

public class Example2ForEach {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Jim");
        names.add("Joan");
        names.add("Jake");

        names.forEach(name-> System.out.println(name));
    }
}
