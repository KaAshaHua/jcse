package com.jcse.util;

public final class Ansi {
    private Ansi() {}

    public static final String esc = "\033";
    public static final String start = "[";
    public static final String end = "m";

    public static final class Foreground {
        private Foreground() {}

        public static final int CODE = 38;

        public static final int BLACK = 30;
        public static final int RED = 31;
        public static final int GREEN = 32;
        public static final int YELLOW = 33;
        public static final int BLUE = 34;
        public static final int MAGENTA = 35;
        public static final int CYAN = 36;
        public static final int WHITE = 37;
        
        public static final int BRIGHT_BLACK = 90;
        public static final int BRIGHT_RED = 91;
        public static final int BRIGHT_GREEN = 92;
        public static final int BRIGHT_YELLOW = 93;
        public static final int BRIGHT_BLUE = 94;
        public static final int BRIGHT_MAGENTA = 95;
        public static final int BRIGHT_CYAN = 96;
        public static final int BRIGHT_WHITE = 97;
    }

    public static final class Background {
        private Background() {}

        public static final int CODE = 48;

        public static final int BLACK = 40;
        public static final int RED = 41;
        public static final int GREEN = 42;
        public static final int YELLOW = 43;
        public static final int BLUE = 44;
        public static final int MAGENTA = 45;
        public static final int CYAN = 46;
        public static final int WHITE = 47;
        
        public static final int BRIGHT_BLACK = 100;
        public static final int BRIGHT_RED = 101;
        public static final int BRIGHT_GREEN = 102;
        public static final int BRIGHT_YELLOW = 103;
        public static final int BRIGHT_BLUE = 104;
        public static final int BRIGHT_MAGENTA = 105;
        public static final int BRIGHT_CYAN = 106;
        public static final int BRIGHT_WHITE = 107;
    }

    public static final class TextStyle {
        private TextStyle() {}

        public static final int RESET = 0;
        public static final int BOLD = 1;
        public static final int DIM = 2;
        public static final int ITALIC = 3;
        public static final int UNDERLINE = 4;
        public static final int SLOW_BLINK = 5;
        public static final int RAPID_BLINK = 6;
        public static final int REVERSE = 7;
        public static final int HIDDEN = 8;
        public static final int STRIKETHROUGH = 9;

        public static final int FRAMED = 51;
        public static final int ENCIRCLED = 52;
        public static final int OVERLINE = 53;
        public static final int NOT_FRAMED = 54;
        public static final int NOT_OVERLINE = 55;

        public static final int SUPERSCRIPT = 73;
        public static final int SUBSCRIPT = 74;
        public static final int NOT_SCRIPT = 75;

        public static final int DOUBLE_UNDERLINE = 21;
        public static final int NORMAL_INTENSITY = 22;
        public static final int NOT_ITALIC = 23;
        public static final int NOT_UNDERLINE = 24;
        public static final int NOT_BLINK = 25;
        public static final int NOT_REVERSE = 27;
        public static final int REVEAL = 28;
        public static final int NOT_STRIKETHROUGH = 29;
    }

    public static String RGB(int code, int r, int g, int b) {
        String rgb = r + ";" + g + ";" + b;
        return esc + start + code + ";2;" + rgb + end;
    }

    public static String color256(int code, String colorCode) {
        return esc + start + code + ";5;" + colorCode + end;
    }

    public static String reset() { return esc + start + TextStyle.RESET + end; }
}
