import java.util.HashSet;

class AnagramGenerator {

    HashSet<String> generate(String base) throws IllegalArgumentException {
        if (base == null || base.length() == 0)
            throw new IllegalArgumentException("The input shouldn't be null or an empty string.");
        else {
            HashSet<String> result = new HashSet<>();
            internalGenerator(base, "", new boolean[base.length()], result);
            return result;
        }
    }

    private void internalGenerator(String base, String acc, boolean[] mark, HashSet<String> result) { // base = "ana" [0, 0, 0]
        if (acc.length() == base.length()) {
            result.add(acc);
            return;
        }
        for (int i = 0; i < base.length(); i++) {
            if (!mark[i]) {
                mark[i] = true;
                internalGenerator(base, acc + base.charAt(i), mark, result);
                mark[i] = false;
            }
        }
    }
}
