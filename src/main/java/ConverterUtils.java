import java.util.HashMap;

public class ConverterUtils {
    final static HashMap<Integer, String> conversionTable = new HashMap<>();

    static {
        conversionTable.put(1, "I");
        conversionTable.put(2, "II");
        conversionTable.put(3, "III");
        conversionTable.put(4, "IV");
        conversionTable.put(5, "V");
        conversionTable.put(6, "VI");
        conversionTable.put(7, "VII");
        conversionTable.put(8, "VIII");
        conversionTable.put(9, "IX");
        conversionTable.put(10, "X");
        conversionTable.put(20, "XX");
        conversionTable.put(30, "XXX");
        conversionTable.put(40, "XL");
        conversionTable.put(50, "L");
        conversionTable.put(60, "LX");
        conversionTable.put(70, "LXX");
        conversionTable.put(80, "LXXX");
        conversionTable.put(90, "XC");
        conversionTable.put(100, "C");
        conversionTable.put(200, "CC");
        conversionTable.put(300, "CCC");
        conversionTable.put(400, "CD");
        conversionTable.put(500, "D");
        conversionTable.put(600, "DC");
        conversionTable.put(700, "DCC");
        conversionTable.put(800, "DCCC");
        conversionTable.put(900, "CM");
        conversionTable.put(1000, "M");
        conversionTable.put(2000, "MM");
        conversionTable.put(3000, "MMM");
        conversionTable.put(4000, "MMMM");
    }
}
