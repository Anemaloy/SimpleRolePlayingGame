package SRPG.units;

public abstract class UnitAbstract {
    private String name;
    private int HP;
    private int power;
    private int xp;
    private int gold;

    public UnitAbstract(String name, int HP, int power, int xp, int gold) {
        this.name = name;
        this.HP = HP;
        this.power = power;
        this.xp = xp;
        this.gold = gold;
    }

    public int attack() {
        return power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getpower() {
        return power;
    }

    public void setpower(int power) {
        this.power = power;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    private int getRandomValue() {
        return (int) (Math.random() * 100);
    }

    public String toString() {
        return String.format("%s здоровье:%d", name, HP);
    }
}
