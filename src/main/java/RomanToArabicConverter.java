import java.util.ArrayList;

class RomanToArabicConverter {

    public static final String EXCEPTION_MESSAGE = "The format of the input was invalid.";

    private int[][] orderOfScanning = {
            {4000, 3000, 2000, 1000},
            {900, 800, 700, 600, 500, 400, 300, 200, 100},
            {90, 80, 70, 60, 50, 40, 30, 20, 10},
            {9, 8, 7, 6, 5, 4, 3, 2, 1}
    };

    private static class Token {
        int group;
        int index;

        public Token(int group, int index) {
            this.group = group;
            this.index = index;
        }
    }

    int convert(String romanNumber) {
        ArrayList<Token> tokens = new ArrayList<>();
        for (int i = 0; i < orderOfScanning.length; i++) {
            for (int j = 0; !romanNumber.equals("") && j < orderOfScanning[i].length; j++) {
                String prefix = ConverterUtils.conversionTable.get(orderOfScanning[i][j]);
                if (romanNumber.startsWith(prefix)) {
                    tokens.add(new Token(i, j));
                    romanNumber = romanNumber.substring(prefix.length());
                }
            }
        }

        if (romanNumber.equals("")) {
            int result = 0;
            int previous = Integer.MIN_VALUE;
            for (Token token: tokens) {
                if (previous < token.group) {
                    result += orderOfScanning[token.group][token.index];
                    previous = token.group;
                } else throw new IllegalArgumentException(EXCEPTION_MESSAGE);
            }
            return result;
        } else throw new IllegalArgumentException(EXCEPTION_MESSAGE);
    }
}
