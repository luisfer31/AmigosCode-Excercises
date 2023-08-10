public class A7_Split {
    public static void main(String[] args) {
        String sentence = "Hello, this is a sample sentence.";
        System.out.printf("The sentence contains %d words",splitSentence(sentence));
    }

    public static int splitSentence(String sentence){
        String[] arrayWords = sentence.split("\\s+");
        return arrayWords.length;
    }
}
