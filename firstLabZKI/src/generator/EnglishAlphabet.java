package generator;

public class EnglishAlphabet implements StringGeneratorProperty {
    private int leftLimit;
    private int rightLimit;

    public EnglishAlphabet() {
        this.leftLimit = 97;
        this.rightLimit = 122;
    }

    @Override
    public Integer getStart() {
        return leftLimit;
    }

    @Override
    public Integer getEnd() {
        return rightLimit;
    }
}
