import generator.EnglishAlphabet;
import generator.StringGeneratorProperty;
import generator.WordGenerator;

public class Main {
    public static void main(String[] args) {
        WordGenerator generator = new WordGenerator(10, new EnglishAlphabet());
        System.out.println(generator.getString());
    }
}
