public class OOPSBannerApp {

    static class Banner {

        void print() {
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

    public static void main(String[] args) {
        Banner banner = new Banner();
        banner.print();
    }
}
