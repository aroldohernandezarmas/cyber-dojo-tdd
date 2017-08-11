import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToArabicConverterTest {

    final private String[] input = {"I", "II", "XV",
            "XLIII", "CXXV", "DCCLXXVIII",
            "MII", "MMCCCXL", "CCXXXIV",
            "MMCXXXI", "DCCLXXXV", "DLXVII",
            "MCCXXXIV", "MMMMDLXVII", "LXXVII",
            "LXXXIV"
    };

    final private int[] output = {1, 2, 15,
            43, 125, 778,
            1002, 2340, 234,
            2131, 785, 567,
            1234, 4567, 77,
            84
    };

    @Test
    public void checkConversion() {
        RomanToArabicConverter converter = new RomanToArabicConverter();

        for (int i = 0; i < input.length; i++) {
            int out = converter.convert(input[i]);
            assertEquals(output[i], out);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkForUnexpectedCharacters() {
        String unexpectedInput = "VCC";
        RomanToArabicConverter converter = new RomanToArabicConverter();
        converter.convert(unexpectedInput);
    }
}
