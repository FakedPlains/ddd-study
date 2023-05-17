package cloud.zfwproject.ddd.demo.ddd.service.combat.impl;

import cloud.zfwproject.ddd.demo.ddd.entity.Monster;
import cloud.zfwproject.ddd.demo.ddd.entity.Player;
import cloud.zfwproject.ddd.demo.ddd.entity.Weapon;
import cloud.zfwproject.ddd.demo.ddd.repository.WeaponRepository;
import cloud.zfwproject.ddd.demo.ddd.service.combat.CombatService;
import cloud.zfwproject.ddd.demo.ddd.service.combat.DamageManager;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/17 2:36 PM
 */
public class CombatServiceImpl implements CombatService {

    private WeaponRepository weaponRepository;
    private DamageManager damageManager;

    @Override
    public void performAttack(Player player, Monster monster) {
        Weapon weapon = weaponRepository.find(player.getWeaponId());
        int damage = damageManager.calculateDamage(player, weapon, monster);
        if (damage > 0) {
            monster.takeDamage(damage);
        }
    }

}
