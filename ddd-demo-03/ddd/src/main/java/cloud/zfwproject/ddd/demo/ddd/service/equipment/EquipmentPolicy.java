package cloud.zfwproject.ddd.demo.ddd.service.equipment;

import cloud.zfwproject.ddd.demo.ddd.model.entity.Player;
import cloud.zfwproject.ddd.demo.ddd.model.entity.Weapon;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/17 2:27 PM
 */
public interface EquipmentPolicy {

    boolean canApply(Player player, Weapon weapon);

    boolean canEquip(Player player, Weapon weapon);

}
