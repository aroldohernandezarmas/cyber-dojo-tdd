class DiversionCalculator {

    int calculate(int n) {
        int[] endsWith0 = new int[n + 1];
        int[] endsWith1 = new int[n + 1];

        endsWith0[1] = endsWith1[1] = 1;
        for (int i = 2; i <= n; i++) {
            endsWith0[i] = endsWith0[i - 1] + endsWith1[i - 1];
            endsWith1[i] = endsWith0[i - 1];
        }

        return endsWith0[n] + endsWith1[n];
    }
}
