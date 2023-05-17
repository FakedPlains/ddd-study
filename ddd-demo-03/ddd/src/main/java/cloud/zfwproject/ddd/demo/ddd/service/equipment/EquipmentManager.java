package cloud.zfwproject.ddd.demo.ddd.service.equipment;

import cloud.zfwproject.ddd.demo.ddd.model.entity.Player;
import cloud.zfwproject.ddd.demo.ddd.model.entity.Weapon;
import cloud.zfwproject.ddd.demo.ddd.service.equipment.policy.DefaultEquipmentPolicy;
import cloud.zfwproject.ddd.demo.ddd.service.equipment.policy.DragoonEquipmentPolicy;
import cloud.zfwproject.ddd.demo.ddd.service.equipment.policy.FighterEquipmentPolicy;
import cloud.zfwproject.ddd.demo.ddd.service.equipment.policy.MageEquipmentPolicy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/17 2:27 PM
 */
public class EquipmentManager {

    private static final List<EquipmentPolicy> POLICIES = new ArrayList<>();

    static {
        POLICIES.add(new FighterEquipmentPolicy());
        POLICIES.add(new MageEquipmentPolicy());
        POLICIES.add(new DragoonEquipmentPolicy());
        POLICIES.add(new DefaultEquipmentPolicy());
    }

    public boolean canEquip(Player player, Weapon weapon) {
        for (EquipmentPolicy policy : POLICIES) {
            if (!policy.canApply(player, weapon)) {
                continue;
            }
            return policy.canEquip(player, weapon);
        }
        return false;
    }

}
