package cloud.zfwproject.ddd.demo.oop;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/17 11:49 AM
 */
public abstract class Monster {

    String name;

    Long health;

    public Monster(String name, Long health) {
        this.name = name;
        this.health = health;
    }

    public void receiveDamageBy(Weapon weapon, Player player) {
        this.health -= weapon.getDamage();
    }

    public Long getHealth() {
        return health;
    }

    public void setHealth(Long health) {
        this.health = health;
    }
}
