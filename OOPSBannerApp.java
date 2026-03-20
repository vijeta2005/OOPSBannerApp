public class OOPSBannerApp {        
    public static class CharacterPatternMap {
        Character character;
        String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    private static final String[] spacePattern = {
        "      ",
        "      ",
        "      ",
        "      ",
        "      ",
        "      ",
        "      ",
        "      ",
        "      "
    };

    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];
        
        String[] oPattern = {
            "     ***     ",
            "  **     **  ",
            " **       ** ",
            " **       ** ",
            " **       ** ",
            " **       ** ",
            " **       ** ",
            "  **     **  ",
            "     ***     "
        };

        String[] pPattern = {
            " *******    ",
            " **     **  ",
            " **      ** ",
            " **     **  ",
            " *******    ",
            " **         ",
            " **         ",
            " **         ",
            " **         "
        };

        String[] sPattern = {
            "    *****    ",
            "  **     **  ",
            " **          ",
            "  **         ",
            "     ***     ",
            "         **  ",
            "          ** ",
            "  **     **  ",
            "    *****    "
        };

        charMaps[0] = new CharacterPatternMap('O', oPattern);
        charMaps[1] = new CharacterPatternMap('P', pPattern);
        charMaps[2] = new CharacterPatternMap('S', sPattern);
        charMaps[3] = new CharacterPatternMap(' ', spacePattern);
        return charMaps;
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() != null && map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        if (ch == ' ') {
            return spacePattern; 
        }
        return getCharacterPattern(' ', charMaps);
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        int patternLines = 9; 
        for (int i = 0; i < patternLines; i++) {
            String row = ""; 
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                row += pattern[i] + "  "; 
            }            
            System.out.println(row);
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}