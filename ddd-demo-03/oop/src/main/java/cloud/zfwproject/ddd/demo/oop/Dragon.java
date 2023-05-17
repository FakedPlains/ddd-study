package cloud.zfwproject.ddd.demo.oop;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/17 11:51 AM
 */
public class Dragon extends Monster {

    public Dragon(String name, Long health) {
        super(name, health);
    }

    @Override
    public void receiveDamageBy(Weapon weapon, Player player) {
        if (player instanceof Dragoon) {
            this.setHealth(this.getHealth() - weapon.getDamage() * 2);
        }
    }

}
