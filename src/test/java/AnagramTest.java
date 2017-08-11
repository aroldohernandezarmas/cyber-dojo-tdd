import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void checkAnagramsForANonEmptyString() {
        // Test case
        String base = "asdfghjku"; // aann, anan, anna, naan, nana, nnaa

        // Anagrams generator
        AnagramGenerator generator = new AnagramGenerator();

        //Anagram generation
        HashSet<String> anagrams = generator.generate(base);

        // Calculating the amount of anagrams from a given a string as function of the amount of characters n!
        int amountOfAnagrams = amountOfAnagramsForAGivenLength(base); // TODO not proper way!!!

        // Asserting that the amount of anagrams generated is actually
        // equal to the expected amount determined by combinatorial deduction
        assertEquals(amountOfAnagrams, anagrams.size());
        System.out.println(">> Count: " + anagrams.size());
        // Preparing the data to check that any generated anagram is actually obtained from the base string
        char[] baseArray = base.toCharArray();
        Arrays.sort(baseArray);

        // Checking if every generated string is an anagram of base
        for (String anagram : anagrams) {
            char[] anagramArray = anagram.toCharArray();
            Arrays.sort(anagramArray);
//            System.out.println(">> " + anagram);
            assertArrayEquals(baseArray, anagramArray);
        }
    }

    @Test
    public void checkThatNoAnagramExistsForAnEmptyOrNullString() {
        String base1 = "";

        // Anagrams generator
        AnagramGenerator generator = new AnagramGenerator();

        //Anagram generation
        HashSet<String> anagrams = generator.generate(base1);
        assertNull(anagrams);

        anagrams = generator.generate(null);
        assertNull(anagrams);
    }

    private int amountOfAnagramsForAGivenLength(String base) {
        int length = base.length();
        int num = factorial(length);
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < base.length(); i++) {
            char ch = base.charAt(i);
            if (mp.containsKey(ch)) mp.put(ch, mp.get(ch) + 1);
            else mp.put(ch, 1);
        }
        for (Integer value : mp.values()) {
            num /= factorial(value);
        }
        return num;
    }

    private int factorial(int length) {
        int result = 1;
        for (int i = 0; i < length; i++) {
            result *= i + 1;
        }
        return result;
    }
}
