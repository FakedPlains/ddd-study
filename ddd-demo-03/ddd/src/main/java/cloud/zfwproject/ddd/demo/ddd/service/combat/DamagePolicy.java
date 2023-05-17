package cloud.zfwproject.ddd.demo.ddd.service.combat;

import cloud.zfwproject.ddd.demo.ddd.entity.Monster;
import cloud.zfwproject.ddd.demo.ddd.entity.Player;
import cloud.zfwproject.ddd.demo.ddd.entity.Weapon;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/17 2:38 PM
 */
public interface DamagePolicy {

    boolean canApply(Player player, Weapon weapon, Monster monster);

    int calculateDamage(Player player, Weapon weapon, Monster monster);

}
