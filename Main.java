package HW_OOP_Java_3;

import HW_OOP_Java_3.System.ConsoleView;
import HW_OOP_Java_3.Units.Peasant;
import HW_OOP_Java_3.Units.Unit;
import HW_OOP_Java_3.Units.blackSide.Crossbowman;
import HW_OOP_Java_3.Units.blackSide.Monk;
import HW_OOP_Java_3.Units.blackSide.Spearman;
import HW_OOP_Java_3.Units.whiteSide.Robber;
import HW_OOP_Java_3.Units.whiteSide.Sniper;
import HW_OOP_Java_3.Units.whiteSide.Wizard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    protected static final int GANG_SIZE = 10;
    protected static List<Unit> blueSide;
    protected static List<Unit> greenSide;

    public static void main(String[] args) throws IOException {
        runGames();


        Scanner scanner = new Scanner(System.in);
        while (true) {

            ConsoleView.view();

            blueSide.forEach(n -> n.step(greenSide));
            greenSide.forEach(n -> n.step(blueSide));

            scanner.nextLine();
        }
    }

    private static void runGames() {
        blueSide = new ArrayList<>();
        greenSide = new ArrayList<>();

        int x = 1;
        int y = 1;
        for (int i = 0; i < GANG_SIZE; i++) {
            switch (new Random().nextInt(4)) {
                case 0 -> blueSide.add(new Robber(blueSide, x, y++));
                case 1 -> blueSide.add(new Sniper(blueSide, x, y++));
                case 2 -> blueSide.add(new Wizard(blueSide, x, y++));
                default -> blueSide.add(new Peasant(blueSide, x, y++));
            }
        }

        x = GANG_SIZE;
        y = 1;
        for (int i = 0; i < GANG_SIZE; i++) {
            switch (new Random().nextInt(4)) {
                case 0 -> greenSide.add(new Peasant(greenSide, x, y++));
                case 1 -> greenSide.add(new Spearman(greenSide, x, y++));
                case 2 -> greenSide.add(new Crossbowman(greenSide, x, y++));
                default -> greenSide.add(new Monk(greenSide, x, y++));
            }
        }
    }

    public static int getGangSize() {
        return GANG_SIZE;
    }

    public static List<Unit> getBlueSide() {
        return blueSide;
    }

    public static List<Unit> getGreenSide() {
        return greenSide;
    }

}
