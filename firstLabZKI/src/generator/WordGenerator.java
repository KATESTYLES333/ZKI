package generator;

import java.util.Random;

public class WordGenerator {
    int targetStringLength;
    int leftLimit;
    int rightLimit;

    public void setAlphabet(StringGeneratorProperty generator){
        this.leftLimit = generator.getStart();
        this.rightLimit = generator.getEnd();
    }

    public WordGenerator(){};
    public WordGenerator(int targetStringLength, StringGeneratorProperty generator){
        this.targetStringLength = targetStringLength;
        this.setAlphabet(generator);
    }

    public String getString(){

            Random random = new Random();
            StringBuilder buffer = new StringBuilder(targetStringLength);
            for (int i = 0; i < targetStringLength; i++) {
                int randomLimitedInt = leftLimit + (int)
                        (random.nextFloat() * (rightLimit - leftLimit + 1));
                buffer.append((char) randomLimitedInt);
            }
            String generatedString = buffer.toString();

            return "generatedString";
    }

}
