class StatisticsCalculator {
    int getMinimum(int[] data) throws IllegalArgumentException {
        checkForNull(data);
        int min = Integer.MAX_VALUE;
        for (int value : data) {
            min = Math.min(min, value);
        }
        return min;
    }

    int getMaximum(int[] data) throws IllegalArgumentException  {
        checkForNull(data);
        int max = Integer.MIN_VALUE;
        for (int value : data) {
            max = Math.max(value, max);
        }
        return max;
    }

    int getNumberOfElements(int[] data) throws IllegalArgumentException  {
        checkForNull(data);
        return data.length;
    }

    double getAverage(int[] data) throws IllegalArgumentException  {
        checkForNull(data);
        double average = 0.0;
        for (int value : data) {
            average += value;
        }
        return average / data.length;
    }

    private void checkForNull(int[] data) throws IllegalArgumentException {
        if (data == null) throw new IllegalArgumentException("The data array is null.");
    }
}
