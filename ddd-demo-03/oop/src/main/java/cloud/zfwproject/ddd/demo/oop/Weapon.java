package cloud.zfwproject.ddd.demo.oop;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/17 11:48 AM
 */
public abstract class Weapon {

    String name;

    int damage;

    int damageType;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public int getDamageType() {
        return damageType;
    }
}
