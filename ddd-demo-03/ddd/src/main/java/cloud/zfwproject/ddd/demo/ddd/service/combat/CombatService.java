package cloud.zfwproject.ddd.demo.ddd.service.combat;

import cloud.zfwproject.ddd.demo.ddd.model.entity.Monster;
import cloud.zfwproject.ddd.demo.ddd.model.entity.Player;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/17 2:36 PM
 */
public interface CombatService {

    void performAttack(Player player, Monster monster);

}
