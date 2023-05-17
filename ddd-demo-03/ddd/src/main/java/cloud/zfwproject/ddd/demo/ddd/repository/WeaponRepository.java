package cloud.zfwproject.ddd.demo.ddd.repository;

import cloud.zfwproject.ddd.demo.ddd.dp.WeaponId;
import cloud.zfwproject.ddd.demo.ddd.entity.Weapon;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/17 2:44 PM
 */
public interface WeaponRepository {

    Weapon find(WeaponId id);

}
