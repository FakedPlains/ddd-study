package cloud.zfwproject.ddd.demo.ddd.entity;

import cloud.zfwproject.ddd.demo.ddd.dp.WeaponId;
import cloud.zfwproject.ddd.demo.ddd.enums.WeaponType;
import lombok.Getter;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/17 2:01 PM
 */
@Getter
public class Weapon {

    private WeaponId id;

    private String name;

    private WeaponType weaponType;

    private int damage;

    private int damageType;

}
