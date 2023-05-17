package cloud.zfwproject.ddd.demo.ddd.service.equipment;

import cloud.zfwproject.ddd.demo.ddd.entity.Player;
import cloud.zfwproject.ddd.demo.ddd.entity.Weapon;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/17 2:22 PM
 */
public interface EquipmentService {

    boolean canEquip(Player player, Weapon weapon);

}
