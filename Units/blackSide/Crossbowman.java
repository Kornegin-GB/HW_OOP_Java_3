package HW_OOP_Java_3.Units.blackSide;

import HW_OOP_Java_3.System.Vector2D;
import HW_OOP_Java_3.Units.Unit;

import java.util.List;

public class Crossbowman extends Unit {
    private int shots;

    public Crossbowman(List<Unit> gang, int x, int y) {
        super(6, 3, new int[]{1, 3}, 10, 4, "Арбалетчик");
        shots = 16;
        super.gang = gang;
        super.position = new Vector2D(x, y);
    }

    @Override
    public String getInfo() {
        return name + "-> " + super.getInfo() + ", В:" + shots;
    }
}
