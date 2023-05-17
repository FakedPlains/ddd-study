package cloud.zfwproject.ddd.demo.ddd.service.equipment.policy;

import cloud.zfwproject.ddd.demo.ddd.entity.Player;
import cloud.zfwproject.ddd.demo.ddd.entity.Weapon;
import cloud.zfwproject.ddd.demo.ddd.enums.PlayerClass;
import cloud.zfwproject.ddd.demo.ddd.enums.WeaponType;
import cloud.zfwproject.ddd.demo.ddd.service.equipment.EquipmentPolicy;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/17 2:29 PM
 */
public class FighterEquipmentPolicy implements EquipmentPolicy {

    @Override
    public boolean canApply(Player player, Weapon weapon) {
        return player.getPlayerClass() == PlayerClass.FIGHTER;
    }

    @Override
    public boolean canEquip(Player player, Weapon weapon) {
        return weapon.getWeaponType() == WeaponType.SWORD || weapon.getWeaponType() == WeaponType.DAGGER;
    }

}
