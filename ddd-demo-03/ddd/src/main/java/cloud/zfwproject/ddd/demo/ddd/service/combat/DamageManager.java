package cloud.zfwproject.ddd.demo.ddd.service.combat;

import cloud.zfwproject.ddd.demo.ddd.entity.Monster;
import cloud.zfwproject.ddd.demo.ddd.entity.Player;
import cloud.zfwproject.ddd.demo.ddd.entity.Weapon;
import cloud.zfwproject.ddd.demo.ddd.service.combat.policy.DragoonPolicy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/17 2:37 PM
 */
public class DamageManager {

    private static final List<DamagePolicy> POLICIES = new ArrayList<>();

    static {
        POLICIES.add(new DragoonPolicy());
    }

    public int calculateDamage(Player player, Weapon weapon, Monster monster) {
        for (DamagePolicy policy : POLICIES) {
            if (!policy.canApply(player, weapon, monster)) {
                continue;
            }
            return policy.calculateDamage(player, weapon, monster);
        }
        return 0;
    }

}
