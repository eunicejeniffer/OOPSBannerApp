/**
 * OOPSBannerApp UC6 – Static Functions for Character Patterns
 * 
 * UC6 improves modularity by creating reusable methods to generate
 * ASCII patterns for O, P, and S instead of hardcoding inline strings.
 */
package UC6;
public class OOPSBannerAppUC6 {

    // Static method to return pattern for O
    public static String[] getO() {
        return new String[]{
            "*****",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*****"
        };
    }

    // Static method to return pattern for P
    public static String[] getP() {
        return new String[]{
            "*****",
            "*   *",
            "*   *",
            "*****",
            "*",
            "*",
            "*"
        };
    }

    // Static method to return pattern for S
    public static String[] getS() {
        return new String[]{
            "*****",
            "*   *",
            "*",
            "*****",
            "    *",
            "*   *",
            "*****"
        };
    }

    public static void main(String[] args) {

        // Build banner using static functions
        String[][] banner = {
                getO(),
                getO(),
                getP(),
                getS()
        };

        System.out.println("OOPS Banner App - UC6 Static Functions");
        System.out.println("--------------------------------------");

        // Print the banner row-by-row
        for (int row = 0; row < 7; row++) {
            String line = "";
            for (String[] letter : banner) {
                line += letter[row] + "   ";
            }
            System.out.println(line);
        }
    }
}
