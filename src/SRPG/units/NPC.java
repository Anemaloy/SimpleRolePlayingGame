package SRPG.units;

public class NPC extends UnitAbstract {

    public NPC(String name, int HP, int power, int xp, int gold) {
        super(name, HP, power, xp, gold);
    }

    public String sell(Goods goods) {
        String result = "";
        if (goods == Goods.POTION) {
            result = "potion";
        }
        return result;
    }

    public enum Goods {
        POTION
    }
}
