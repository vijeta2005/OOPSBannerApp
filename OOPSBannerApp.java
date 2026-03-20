import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static class BannerCharacter {
        private final char character;
        private final String[] pattern;

        public BannerCharacter(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static Map<Character, BannerCharacter> buildCharacterMap() {

        Map<Character, BannerCharacter> map = new HashMap<>();

        map.put('O', new BannerCharacter('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        map.put('P', new BannerCharacter('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        }));

        map.put('S', new BannerCharacter('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        }));

        return map;
    }

    public static void printBanner(String message, Map<Character, BannerCharacter> map) {

        int rows = 7;

        for (int row = 0; row < rows; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : message.toCharArray()) {

                BannerCharacter bc = map.get(ch);

                if (bc != null) {
                    lineBuilder.append(bc.getPattern()[row]).append("  ");
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }

    public static void main(String[] args) {

        Map<Character, BannerCharacter> characterMap = buildCharacterMap();

        String message = "OOPS";

        printBanner(message, characterMap);
    }
}