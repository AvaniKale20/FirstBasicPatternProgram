import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareStarPatternTest {

    @Test
    public void given() {
        SquareStarPattern squareStarPattern = new SquareStarPattern(1);
        Assertions.assertEquals("*", squareStarPattern.print());
    }
}
