public class StarPattern {
    private int inputForIthAndJthValue;

    public StarPattern(int inputForIthAndJthValue) {
        this.inputForIthAndJthValue = inputForIthAndJthValue;
    }

    public String print() {

        String output = "";

        for (int i = 0; i < inputForIthAndJthValue; i++) {
            for (int j = 0; j < inputForIthAndJthValue; j++) {
                output += "*";
            }
            if (i != inputForIthAndJthValue - 1) {
                output += "\n";
            }
        }
        return output;
    }
}
