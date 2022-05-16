package SRPG.units.monsters;

import SRPG.units.UnitAbstract;

public class Orc extends UnitAbstract {

    public Orc(String name, int HP, int power, int xp, int gold) {
        super(name, HP, power, xp, gold);
    }

    public static Orc createOrc() {
        return new Orc(
                "Орк",
                25,
                20,
                100,
                10
        );
    }
}
