import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner App - UC8
 * Using Map Collection to store character patterns
 */
public class OOPSBannerApp {

    /**
     * Utility method to create and return character pattern map
     * @return Map of Character and String[] pattern
     */
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return patternMap;
    }

    /**
     * Utility method to print banner word
     * @param word banner word
     * @param patternMap map containing patterns
     */
    public static void printBanner(String word, Map<Character, String[]> patternMap) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (int col = 0; col < word.length(); col++) {

                char ch = word.charAt(col);
                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        String word = "OOPS";

        Map<Character, String[]> patternMap = buildCharacterPatterns();

        printBanner(word, patternMap);
    }
}
