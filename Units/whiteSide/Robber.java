package HW_OOP_Java_3.Units.whiteSide;

import HW_OOP_Java_3.System.Vector2D;
import HW_OOP_Java_3.Units.Unit;

import java.util.List;

public class Robber extends Unit {
    public Robber(List<Unit> gang, int x, int y) {
        super(8, 3, new int[]{2, 4}, 10, 6, "Разбойник");
        super.gang = gang;
        super.position = new Vector2D(x, y);
    }

    @Override
    public String getInfo() {
        return name + "-> " + super.getInfo();
    }
}
