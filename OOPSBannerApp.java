
public class OOPSBannerApp {
    public static void main(String[] args) {

        System.out.println();
        String lines[] = {
            String.join("   ","   *****   ","   *****   ","*******   ","   *****   "),
            String.join("   "," **     ** "," **     ** ","**     ** "," **     ** "),
            String.join("   ","**       **","**       **","**      **","**         "),
            String.join("   ","**       **","**       **","**     ** "," **        "),
            String.join("   ","**       **","**       **","*******   ","    ***    "),
            String.join("   ","**       **","**       **","**        ","        ** "),
            String.join("   ","**       **","**       **","**        ","         **"),
            String.join("   "," **     ** "," **     ** ","**        "," **     ** "),
            String.join("   ","   *****   ","   *****   ","**        ","   *****   "),
        };
        System.out.println();

        for (String line : lines) {
            System.out.println(line);
        }
        System.out.println();
    }
}
