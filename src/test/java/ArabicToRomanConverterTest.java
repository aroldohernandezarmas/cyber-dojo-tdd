import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArabicToRomanConverterTest {

    final private int[] input = {1, 2, 15,
            43, 125, 778,
            1002, 2340, 234,
            2131, 785, 567,
            1234, 4567, 77,
            84
    };

    final private String[] output = {"I", "II", "XV",
            "XLIII", "CXXV", "DCCLXXVIII",
            "MII", "MMCCCXL", "CCXXXIV",
            "MMCXXXI", "DCCLXXXV", "DLXVII",
            "MCCXXXIV", "MMMMDLXVII", "LXXVII",
            "LXXXIV"
    };

    @Test
    public void checkConversion() {
        ArabicToRomanConverter converter = new ArabicToRomanConverter();

        for (int i = 0; i < input.length; i++) {
            String out = converter.convert(input[i]);
            assertEquals(output[i], out);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkResultsForIntegersTooBig() {
        ArabicToRomanConverter converter = new ArabicToRomanConverter();
        int tooBig = 7000;
        converter.convert(tooBig);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkResultsForIntegersTooSmall() {
        ArabicToRomanConverter converter = new ArabicToRomanConverter();
        int tooBig = 0;
        converter.convert(tooBig);
    }

}
