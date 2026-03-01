import java.util.HashMap;

public class OOPSBannerApp {

    public static void main(String[] args) {

        HashMap<Integer, String> banner = new HashMap<>();

        banner.put(1, "  *****     *****     *******    *****  ");
        banner.put(2, " *     *   *     *   *      *   *     * ");
        banner.put(3, " *     *   *     *   *      *   *       ");
        banner.put(4, " *     *   *     *    *******     *****  ");
        banner.put(5, " *     *   *     *   *              *    ");
        banner.put(6, " *     *   *     *   *        *     *    ");
        banner.put(7, "  *****     *****    *         *****     ");

        for (int i = 1; i <= banner.size(); i++) {
            System.out.println(banner.get(i));
        }
    }
}
