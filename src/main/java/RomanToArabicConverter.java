class RomanToArabicConverter {

    private int[] orderOfScanning = {
            4000, 3000, 2000, 1000,
            900, 800, 700, 600, 500, 400, 300, 200, 100,
            90, 80, 70, 60, 50, 40, 30, 20, 10,
            9, 8, 7, 6, 5, 4, 3, 2, 1
    };

    int convert(String romanNumber) {
        int result = 0;
        for (int i = 0; !romanNumber.equals("") && i < orderOfScanning.length; i++) {
            String prefix = ConverterUtils.conversionTable.get(orderOfScanning[i]);
            if (romanNumber.startsWith(prefix)) {
                result += orderOfScanning[i];
                romanNumber = romanNumber.substring(prefix.length());
            }
        }

        if (romanNumber.equals(""))
            return result;
        else throw new IllegalArgumentException("The format of the input was invalid.");
    }
}
