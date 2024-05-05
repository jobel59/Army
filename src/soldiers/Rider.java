package soldiers;

import aClasses.Soldier;
import enums.SoldierTypeEnum;
import interfaces.Offensive;

public class Rider extends Soldier implements Offensive {
    public Rider(String name, int damage, SoldierTypeEnum soldierType) {
        super(name, damage, soldierType);
    }

    @Override
    public void report() {
        System.out.println("Soldier " + super.getName() + " here. Damage is " + super.getDamage() + ", type " + super.getType());
    }

    @Override
    public void attack() {
        System.out.println("Soldier " + super.getName() + " attacks.");
    }

    public void surroundEnemy() {
        System.out.println("Soldier " + super.getName() + " can surround the enemy");
    }

}