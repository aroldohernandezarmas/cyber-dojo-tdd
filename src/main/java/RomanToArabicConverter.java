class RomanToArabicConverter {

    private int[][] orderOfScanning = {
            {4000, 3000, 2000, 1000},
            {900, 800, 700, 600, 500, 400, 300, 200, 100},
            {90, 80, 70, 60, 50, 40, 30, 20, 10},
            {9, 8, 7, 6, 5, 4, 3, 2, 1}
    };

    int convert(String romanNumber) {
        int result = 0;
        for (int[] anOrderOfScanning : orderOfScanning) {
            for (int j = 0; !romanNumber.equals("") && j < anOrderOfScanning.length; j++) {
                String prefix = ConverterUtils.conversionTable.get(anOrderOfScanning[j]);
                if (romanNumber.startsWith(prefix)) {
                    result += anOrderOfScanning[j];
                    romanNumber = romanNumber.substring(prefix.length());
                    break;
                }
            }
        }
        if (romanNumber.equals("")) return result;
        else throw new IllegalArgumentException("The format of the input was invalid.");
    }
}
