/**
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // UC5: String array inline initialization using String.join()
        String[] lines = {
            String.join(" ", "*****", "*   *", "*   *", "*   *", "*   *", "*   *", "*****"),
            String.join(" ", "*****", "*   *", "*   *", "*   *", "*   *", "*   *", "*****"),
            String.join(" ", "*****", "*   *", "*   *", "*****", "*",     "*",     "*"),
            String.join(" ", "*****", "*   *", "*",     "*****", "    *", "*   *", "*****")
        };

        // Enhanced for-loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
