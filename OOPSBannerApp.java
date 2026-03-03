public class OOPSBannerUC4 {

    public static void main(String[] args) {

        // O pattern
        String[] O = {
            String.join(" ", " ***** "),
            String.join(" ", "*     *"),
            String.join(" ", "*     *"),
            String.join(" ", "*     *"),
            String.join(" ", "*     *"),
            String.join(" ", "*     *"),
            String.join(" ", " ***** ")
        };

        // P pattern
        String[] P = {
            String.join(" ", "****** "),
            String.join(" ", "*     *"),
            String.join(" ", "*     *"),
            String.join(" ", "****** "),
            String.join(" ", "*       "),
            String.join(" ", "*       "),
            String.join(" ", "*       ")
        };

        // S pattern
        String[] S = {
            String.join(" ", " ***** "),
            String.join(" ", "*     *"),
            String.join(" ", "*       "),
            String.join(" ", " ***** "),
            String.join(" ", "      *"),
            String.join(" ", "*     *"),
            String.join(" ", " ***** ")
        };

        // Combine O O P S arrays into a single 2D array
        String[][] banner = { O, O, P, S };

        System.out.println("OOPS Banner App - UC4 Using Arrays & Loops");
        System.out.println("-------------------------------------------");

        // Print banner using loops
        for (int row = 0; row < 7; row++) {
            String line = "";
            for (String[] letter : banner) {
                line += letter[row] + "   ";  // spacing between letters
            }
            System.out.println(line);
        }
    }
}
