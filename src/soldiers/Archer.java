package soldiers;

import aClasses.Soldier;
import enums.SoldierTypeEnum;
import interfaces.Defensive;

public class Archer extends Soldier implements Defensive {
    public Archer(String name, int damage, SoldierTypeEnum soldierType) {
        super(name, damage, soldierType);
    }

    @Override
    public void report() {
        System.out.println("Soldier " + super.getName() + " here. Damage is " + super.getDamage() + ", type " + super.getType());
    }

    @Override
    public void defend() {
        System.out.println("Soldier " + super.getName() + " defends.");
    }

    public void flamingArrows() {
        System.out.println("Soldier " + super.getName() + " is shooting flaming arrows");
    }

}