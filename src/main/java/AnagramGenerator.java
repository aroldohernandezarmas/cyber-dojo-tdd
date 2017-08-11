import java.util.HashSet;

class AnagramGenerator {

    private boolean[] mark;
    private String base;
    private HashSet<String> result = new HashSet<>();

    HashSet<String> generate(String base) {
        if (base == null || base.length() == 0) return null;
        else {
            this.base = base;
            this.mark = new boolean[base.length()];
            internalGenerator("");
            return result;
        }
    }

    private void internalGenerator(String acc) { // base = "ana" [0, 0, 0]
        if (acc.length() == base.length()) result.add(acc);
        for (int i = 0; i < base.length(); i++) {
            if (!mark[i]) {
                mark[i] = true;
                internalGenerator(acc + base.charAt(i));
                mark[i] = false;
            }
        }
    }
}
