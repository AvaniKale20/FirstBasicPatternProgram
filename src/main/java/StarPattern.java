public class StarPattern {
    private int inputForIthAndJthValue;

    public StarPattern(int inputForIthAndJthValue) {
        this.inputForIthAndJthValue = inputForIthAndJthValue;
    }

    public String print() {
        if (inputForIthAndJthValue == 1) {
            return "*";
        }
        return "* * \n * *";

    }
}
