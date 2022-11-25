package HW_OOP_Java_3.Units.blackSide;

import HW_OOP_Java_3.System.Vector2D;
import HW_OOP_Java_3.Units.Unit;

import java.util.List;

public class Spearman extends Unit {
    public Spearman(List<Unit> gang, int x, int y) {
        super(4, 5, new int[]{1, 3}, 10, 4, "Копейщик");
        super.gang = gang;
        super.position = new Vector2D(x, y);
    }

    @Override
    public String getInfo() {
        return name + "-> " + super.getInfo();
    }
}
