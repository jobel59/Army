package aClasses;

import enums.SoldierTypeEnum;

public abstract class Soldier {
    private final String name;
    private final int damage;
    private final SoldierTypeEnum soldierType;

    public Soldier(String name, int damage, SoldierTypeEnum soldierBehaviorEnum) {
        this.name = name;
        this.damage = damage;
        this.soldierType = soldierBehaviorEnum;
    }

    public abstract void report();

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public SoldierTypeEnum getType() {
        return soldierType;
    }
}