package cloud.zfwproject.ddd.demo.ddd.service.combat.policy;

import cloud.zfwproject.ddd.demo.ddd.entity.Monster;
import cloud.zfwproject.ddd.demo.ddd.entity.Player;
import cloud.zfwproject.ddd.demo.ddd.entity.Weapon;
import cloud.zfwproject.ddd.demo.ddd.enums.MonsterClass;
import cloud.zfwproject.ddd.demo.ddd.enums.PlayerClass;
import cloud.zfwproject.ddd.demo.ddd.service.combat.DamagePolicy;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/17 2:40 PM
 */
public class DragoonPolicy implements DamagePolicy {

    @Override
    public boolean canApply(Player player, Weapon weapon, Monster monster) {
        return player.getPlayerClass() == PlayerClass.DRAGOON && monster.getMonsterClass() == MonsterClass.DRAGON;
    }

    @Override
    public int calculateDamage(Player player, Weapon weapon, Monster monster) {
        return weapon.getDamage() * 2;
    }

}
