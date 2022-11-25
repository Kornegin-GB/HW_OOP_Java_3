package HW_OOP_Java_3.Units.whiteSide;

import HW_OOP_Java_3.System.Vector2D;
import HW_OOP_Java_3.Units.Unit;

import java.util.List;

public class Sniper extends Unit {
    private int shots;

    public Sniper(List<Unit> gang, int x, int y) {
        super(12, 10, new int[]{8, 10}, 15, 9, "Снайпер");
        shots = 32;
        super.gang = gang;
        super.position = new Vector2D(x, y);
    }

    @Override
    public String getInfo() {
        return name + "-> " + super.getInfo() + ", В:" + shots;
    }
}
