package cloud.zfwproject.ddd.demo.oop;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/17 11:48 AM
 */
public abstract class Player {

    String name;

    Weapon weapon;

    public Player(String name) {
        this.name = name;
    }

    public void attack(Monster monster) {
        monster.receiveDamageBy(weapon, this);
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
