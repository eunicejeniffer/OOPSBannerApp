public class OOPSBannerApp {

    public static void main(String[] args) {
        printBanner();
    }

    public static void printBanner() {

        String[] banner = {
                "  *****     *****     *******    *****  ",
                " *     *   *     *   *      *   *     * ",
                " *     *   *     *   *      *   *       ",
                " *     *   *     *    *******     *****  ",
                " *     *   *     *   *              *    ",
                " *     *   *     *   *        *     *    ",
                "  *****     *****    *         *****     "
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
