import aClasses.Soldier;
import enums.SoldierTypeEnum;
import interfaces.Adaptable;
import interfaces.Defensive;
import interfaces.Offensive;
import soldiers.Archer;
import soldiers.Rider;
import soldiers.Swordsman;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final Archer archer1 = new Archer("Archer1", 1, SoldierTypeEnum.DEFENSIVE);
        final Archer archer2 = new Archer("Archer2", 2, SoldierTypeEnum.DEFENSIVE);

        final Rider rider1 = new Rider("Rider1", 3, SoldierTypeEnum.OFFENSIVE);
        final Rider rider2 = new Rider("Rider2", 4, SoldierTypeEnum.OFFENSIVE);

        final Swordsman swordsman1 = new Swordsman("Swordsman1", 5, SoldierTypeEnum.ADAPTABLE);
        final Swordsman swordsman2 = new Swordsman("Swordsman2", 6, SoldierTypeEnum.ADAPTABLE);

        List<Soldier> soldiers = List.of(archer1, archer2, rider1, rider2, swordsman1, swordsman2);

        System.out.println("-------- REPORT --------");
        for (Soldier soldier : soldiers) {
            soldier.report();
        }

        System.out.println(" ");

        System.out.println("----- DEFEND -----");
        for (Soldier soldier : soldiers) {
            if (soldier instanceof Defensive) {
                ((Defensive) soldier).defend();
            }
        }

        System.out.println(" ");

        System.out.println("----- ATTACK -----");
        for (Soldier soldier : soldiers) {
            if (soldier instanceof Offensive) {
                ((Offensive) soldier).attack();
            }
        }

        System.out.println(" ");

        System.out.println("----- ADAPTABLE -----");
        for (Soldier soldier : soldiers) {
            if (soldier instanceof Adaptable) {
                ((Adaptable) soldier).attackAndDefend();
            }
        }

        System.out.println(" ");

        System.out.println("----- SPECIAL ABILITIES -----");
        for (Soldier soldier : soldiers) {
            if (soldier instanceof Archer) {
                ((Archer) soldier).flamingArrows();
            }
            if (soldier instanceof Rider) {
                ((Rider) soldier).surroundEnemy();
            }
            if (soldier instanceof Swordsman) {
                ((Swordsman) soldier).closeCombat();
            }
        }
    }
}
