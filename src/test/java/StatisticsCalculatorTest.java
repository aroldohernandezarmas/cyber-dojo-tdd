import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StatisticsCalculatorTest {

    private int[] data = new int[]{-1, 2, 7, 4, 2, 8, 5, -3};

    @Test
    public void checkMinimumCorrectness() {
        StatisticsCalculator calculator = new StatisticsCalculator();
        int min = calculator.getMinimum(data);

        int expectedMinimum = Integer.MAX_VALUE;

        for (int value : data) {
            if (value < expectedMinimum) {
                expectedMinimum = value;
            }
        }
        assertEquals(expectedMinimum, min);
    }

    @Test
    public void checkMaximumCorrectness() {
        StatisticsCalculator calculator = new StatisticsCalculator();
        int max = calculator.getMaximum(data);

        int expectedMaximum = Integer.MIN_VALUE;

        for (int value : data) {
            if (value > expectedMaximum) {
                expectedMaximum = value;
            }
        }
        assertEquals(expectedMaximum, max);
    }

    @Test
    public void checkNumberOfElementsCorrectness() {
        StatisticsCalculator calculator = new StatisticsCalculator();
        int numberOfElements = calculator.getNumberOfElements(data);

        assertEquals(numberOfElements, data.length);
    }

    @Test
    public void checkAverage() {
        StatisticsCalculator calculator = new StatisticsCalculator();
        double average = calculator.getAverage(data);

        double expectedAverage = 0.0;

        for (int value : data) {
            expectedAverage += value;
        }

        expectedAverage /= data.length;

        assertEquals(expectedAverage, average, 1e-8);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkIfExceptionIsThrownWhenFindingMinimumWithANullArray() {
        StatisticsCalculator calculator = new StatisticsCalculator();
        calculator.getMinimum(null);
    }
}