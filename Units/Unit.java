package HW_OOP_Java_3.Units;

import HW_OOP_Java_3.System.Vector2D;

import java.util.List;

public abstract class Unit implements UnitInterface {
    protected final float MAX_HEALTH;
    protected String name;
    protected float health;
    protected int attack;
    protected int protection;
    protected int[] damage;
    protected int speed;
    protected String action;
    protected List<Unit> gang;
    protected Vector2D position;


    public Unit(int attack, int protection, int[] damage, float health, int speed, String name) {
        this.attack = attack;
        this.name = name;
        this.protection = protection;
        this.damage = damage;
        this.health = health;
        this.MAX_HEALTH = health;
        this.speed = speed;
    }

    public Vector2D getPosition() {
        return position;
    }

    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public float getMAX_HEALTH() {
        return MAX_HEALTH;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getInfo() {
        return "A:" + attack + ", З:" + protection + ", У:" + (damage[0] + damage[1]) / 2 + ", Зд:" + health + ", С:" + speed;
    }

    @Override
    public void step(List<Unit> gang) {
        position.setX(position.getX() + 1);
//        int index = 0;
//        float dist = Float.MAX_VALUE;
//        for (int i = 0; i < gang.size(); i++) {
//            if (....){
//                index = i;
//                dist = ....
//            }
//        }
//        position.x++;
    }
}
