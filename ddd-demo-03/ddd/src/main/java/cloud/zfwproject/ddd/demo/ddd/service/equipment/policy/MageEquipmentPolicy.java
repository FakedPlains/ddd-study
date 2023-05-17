package cloud.zfwproject.ddd.demo.ddd.service.equipment.policy;

import cloud.zfwproject.ddd.demo.ddd.entity.Player;
import cloud.zfwproject.ddd.demo.ddd.entity.Weapon;
import cloud.zfwproject.ddd.demo.ddd.service.equipment.EquipmentPolicy;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/17 2:31 PM
 */
public class MageEquipmentPolicy implements EquipmentPolicy {
    @Override
    public boolean canApply(Player player, Weapon weapon) {
        return false;
    }

    @Override
    public boolean canEquip(Player player, Weapon weapon) {
        return false;
    }
}
