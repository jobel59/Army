package soldiers;

import aClasses.Soldier;
import enums.SoldierTypeEnum;
import interfaces.Adaptable;

public class Swordsman extends Soldier implements Adaptable {
    public Swordsman(String name, int damage, SoldierTypeEnum soldierType) {
        super(name, damage, soldierType);
    }

    @Override
    public void report() {
        System.out.println("Soldier " + super.getName() + " here. Damage is " + super.getDamage() + ", type " + super.getType());
    }

    @Override
    public void attackAndDefend() {
        System.out.println("Soldier " + super.getName() + " attacks or defends.");
    }

    public void closeCombat() {
        System.out.println("Soldier " + super.getName() + " fights in close quarters");
    }

}