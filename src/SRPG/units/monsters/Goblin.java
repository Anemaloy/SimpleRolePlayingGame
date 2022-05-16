package SRPG.units.monsters;

import SRPG.units.UnitAbstract;

public class Goblin extends UnitAbstract {

    public Goblin(String name, int HP, int power, int xp, int gold) {
        super(name, HP, power, xp, gold);
    }

    public static Goblin createGoblin() {
        return new Goblin(
                "Гоблин",
                50,
                10,
                100,
                20
        );
    }
}
