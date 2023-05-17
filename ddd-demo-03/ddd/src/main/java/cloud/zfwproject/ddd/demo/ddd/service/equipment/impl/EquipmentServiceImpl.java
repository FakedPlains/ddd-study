package cloud.zfwproject.ddd.demo.ddd.service.equipment.impl;

import cloud.zfwproject.ddd.demo.ddd.model.entity.Player;
import cloud.zfwproject.ddd.demo.ddd.model.entity.Weapon;
import cloud.zfwproject.ddd.demo.ddd.service.equipment.EquipmentManager;
import cloud.zfwproject.ddd.demo.ddd.service.equipment.EquipmentService;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/17 2:23 PM
 */
public class EquipmentServiceImpl implements EquipmentService {

    private EquipmentManager equipmentManager;

    @Override
    public boolean canEquip(Player player, Weapon weapon) {
        return equipmentManager.canEquip(player, weapon);
    }

}
