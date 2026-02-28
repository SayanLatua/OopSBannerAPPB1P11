/**
 * OOPSBannerApp4
 *
 * This application prints OOPS in Banner Format using a String array
 * and a loop to print each line, improving modularity and reusability.
 * 
 * Author: Sayan Latua
 * Version: 4.0
 */
public class OOPSBannerApp4 {

    public static void main(String[] args) {

        // Create a String array to store each line of the banner
        String[] bannerLines = new String[7];

        // Populate each line using String.join() for each character
        bannerLines[0] = String.join("",
                "  *****  ",
                "  *****  ",
                " ******  ",
                " ******* ");

        bannerLines[1] = String.join("",
                " *     * ",
                " *     * ",
                " *     * ",
                " *       ");

        bannerLines[2] = String.join("",
                " *     * ",
                " *     * ",
                " *     * ",
                " *       ");

        bannerLines[3] = String.join("",
                " *     * ",
                " *     * ",
                " ******  ",
                "  *****  ");

        bannerLines[4] = String.join("",
                " *     * ",
                " *     * ",
                " *       ",
                "       * ");

        bannerLines[5] = String.join("",
                " *     * ",
                " *     * ",
                " *       ",
                "       * ");

        bannerLines[6] = String.join("",
                "  *****  ",
                "  *****  ",
                " *       ",
                " ******  ");

        // Print each line using a for-each loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}