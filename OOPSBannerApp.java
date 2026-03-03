/**
 * OOPS Banner App - UC7
 * Store Character Pattern in a Static Inner Class
 */
public class OOPSBannerApp {

    /**
     * Static Inner Class to store character and its banner pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor
         * @param character character to store
         * @param pattern 7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to get pattern for a character
     * @param ch input character
     * @return CharacterPatternMap object
     */
    public static CharacterPatternMap getCharacterPattern(char ch) {

        switch (ch) {

            case 'O':
                return new CharacterPatternMap('O', new String[]{
                        " ***** ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *",
                        " ***** "
                });

            case 'P':
                return new CharacterPatternMap('P', new String[]{
                        " ***** ",
                        "*     *",
                        "*     *",
                        " ***** ",
                        "*      ",
                        "*      ",
                        "*      "
                });

            case 'S':
                return new CharacterPatternMap('S', new String[]{
                        " ***** ",
                        "*      ",
                        "*      ",
                        " ***** ",
                        "      *",
                        "      *",
                        " ***** "
                });

            default:
                return null;
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        String word = "OOPS";

        CharacterPatternMap[] characters = new CharacterPatternMap[word.length()];

        for (int i = 0; i < word.length(); i++) {
            characters[i] = getCharacterPattern(word.charAt(i));
        }

        // Print banner row by row
        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap cp : characters) {
                line.append(cp.getPattern()[row]).append("  ");
            }

            System.out.println(line);
        }
    }
}
