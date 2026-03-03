public class OOPSBannerUC3 {

    public static void main(String[] args) {

        // Line patterns for each character using String.join(" ", ...)
        String[] O = {
                String.join(" ", " ***** "),
                String.join(" ", "*     *"),
                String.join(" ", "*     *"),
                String.join(" ", "*     *"),
                String.join(" ", "*     *"),
                String.join(" ", "*     *"),
                String.join(" ", " ***** ")
        };

        String[] P = {
                String.join(" ", "****** "),
                String.join(" ", "*     *"),
                String.join(" ", "*     *"),
                String.join(" ", "****** "),
                String.join(" ", "*       "),
                String.join(" ", "*       "),
                String.join(" ", "*       ")
        };

        String[] S = {
                String.join(" ", " ***** "),
                String.join(" ", "*     *"),
                String.join(" ", "*       "),
                String.join(" ", " ***** "),
                String.join(" ", "      *"),
                String.join(" ", "*     *"),
                String.join(" ", " ***** ")
        };

        // Display banner rows by combining corresponding lines of O O P S
        System.out.println("OOPS Banner App - UC3: Render Using String.join()");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < 7; i++) {
            System.out.println(
                String.join("   ", O[i], O[i], P[i], S[i])  // 3 spaces between characters
            );
        }
    }
