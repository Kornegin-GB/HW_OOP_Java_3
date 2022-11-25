package HW_OOP_Java_3.Units;

import HW_OOP_Java_3.System.Vector2D;

import java.util.List;

public class Peasant extends Unit {
    private boolean delivery;

    public Peasant(List<Unit> gang, int x, int y) {
        super(1, 1, new int[]{1, 1}, 1, 3, "Крестьянин");
        delivery = true;
        super.gang = gang;
        super.position = new Vector2D(x, y);
    }

    @Override
    public String getInfo() {
        return name + "-> " + super.getInfo() + ", Доставка";
    }
}
