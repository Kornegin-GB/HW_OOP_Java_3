package HW_OOP_Java_3.System;

import HW_OOP_Java_3.Main;

import java.util.Collections;

public class ConsoleView {
    private static final String TOP10 = formatDiv("a") + String.join("", Collections.nCopies(Main.getGangSize() - 1, formatDiv("-b"))) + formatDiv("-c");
    private static final String MID10 = formatDiv("d") + String.join("", Collections.nCopies(Main.getGangSize() - 1, formatDiv("-e"))) + formatDiv("-f");
    private static final String BOTTOM10 = formatDiv("g") + String.join("", Collections.nCopies(Main.getGangSize() - 1, formatDiv("-h"))) + formatDiv("-i");
    private static int step = 0;

    public static void view() {
        if (step == 0) {
            System.out.println(AnsiColors.ANSI_RED + "Начало игры." + AnsiColors.ANSI_RESET);
        } else {
            System.out.println(AnsiColors.ANSI_RED + "Ход №" + step + "." + AnsiColors.ANSI_RESET);
        }
        step++;

        System.out.println(ConsoleView.TOP10);
        int a = 0;
        for (int i = 1; i <= Main.getGangSize() - 1; i++) {
            for (int j = 1; j <= Main.getGangSize(); j++) {
                System.out.print(getChar(new Vector2D(j, i)));
                a = j;
            }
            System.out.println("|");
            System.out.println(ConsoleView.MID10);
        }

        for (int j = 1; j <= Main.getGangSize(); j++) {
            System.out.print(getChar(new Vector2D(j, Main.getGangSize() - 1)));
        }
        System.out.println("|");
        System.out.println(ConsoleView.BOTTOM10);
        System.out.println("Press Enter.");
    }

    private static String formatDiv(String str) {
        return str.replace('a', '\u250c')
                .replace('b', '\u252c')
                .replace('c', '\u2510')
                .replace('d', '\u251c')
                .replace('e', '\u253c')
                .replace('f', '\u2524')
                .replace('g', '\u2514')
                .replace('h', '\u2534')
                .replace('i', '\u2518')
                .replace('-', '\u2500');
    }

    private static String getChar(Vector2D position) {
        String str = "| ";
        for (int i = 0; i < Main.getGangSize(); i++) {
            if (Main.getBlueSide().get(i).getPosition().isEquals(position)) {
                str = "|" + AnsiColors.ANSI_BLUE + Main.getBlueSide().get(i).getName().toUpperCase().charAt(0) + AnsiColors.ANSI_RESET;
            }
            if (Main.getGreenSide().get(i).getPosition().isEquals(position)) {
                str = "|" + AnsiColors.ANSI_GREEN + Main.getGreenSide().get(i).getName().toUpperCase().charAt(0) + AnsiColors.ANSI_RESET;
            }
        }
        return str;
    }
}

