public class SquareStarPattern {
    private int inputForIthAndJthValue;

    public SquareStarPattern(int inputForIthAndJthValue) {
        this.inputForIthAndJthValue = inputForIthAndJthValue;
    }

    public String print() {
        for (int i = 1; i <= inputForIthAndJthValue; i++) {
            for (int j = 1; j <= inputForIthAndJthValue; j++) {
                return "*";
            }
        }
        return null;
    }
}
