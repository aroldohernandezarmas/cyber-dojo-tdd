import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiversionTest {

    @Test
    public void checkTheCountingOfNonAdjacentOnesInNLengthBitString() {
        int n = 10;

        DiversionCalculator calculator = new DiversionCalculator();
        int result = calculator.calculate(n);

        int counter = 0;
        for (int i = 0; i < (1 << n); i++) {
            boolean match = true;
            for (int j = 1; j < n; j++) {
                if ((i & (1 << j)) != 0 && (i & (1 << (j - 1))) != 0) {
                    match = false;
                    break;
                }
            }
            counter += match ? 1 : 0;
        }
        assertEquals(counter, result);
        System.out.println(">> Counter = " + counter);
    }

}
