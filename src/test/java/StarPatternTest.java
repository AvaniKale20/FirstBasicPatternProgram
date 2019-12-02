import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StarPatternTest {
    //
    @Test
    public void givenNInputWithOne_WhenPrint_ThenShouldBePrintOneStar() {
        StarPattern squareStarPattern = new StarPattern(1);
        Assertions.assertEquals("*", squareStarPattern.print());
    }

    @Test
    public void givenNInputWithTwoByTwo_WhenPrint_ThenShouldBePrintFourStar() {
        StarPattern squareStarPattern = new StarPattern(2);
        Assertions.assertEquals("* * \n * *", squareStarPattern.print());
    }

    @Test
    public void givenNInputWithThreeByThree_WhenPrint_ThenShouldBePrintFourStar() {
        StarPattern squareStarPattern = new StarPattern(3);
        Assertions.assertEquals("* * * \n * * * \n * * *", squareStarPattern.print());
    }

}
