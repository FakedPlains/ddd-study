package cloud.zfwproject.ddd.demo.ddd.model.entity;

import cloud.zfwproject.ddd.demo.ddd.model.dp.PlayerId;
import cloud.zfwproject.ddd.demo.ddd.model.dp.Transform;
import cloud.zfwproject.ddd.demo.ddd.model.dp.Vector;
import cloud.zfwproject.ddd.demo.ddd.model.dp.WeaponId;
import cloud.zfwproject.ddd.demo.ddd.model.enums.PlayerClass;
import cloud.zfwproject.ddd.demo.ddd.service.equipment.EquipmentService;
import lombok.Getter;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/17 2:00 PM
 */
@Getter
public class Player implements Movable {

    private PlayerId id;

    private String name;

    private PlayerClass playerClass;

    private WeaponId weaponId;

    private Transform position = Transform.ORIGIN;

    private Vector velocity = Vector.ZERO;

    public void equip(Weapon weapon, EquipmentService equipmentService) {
        if (equipmentService.canEquip(this, weapon)) {
            this.weaponId = weapon.getId();
        } else {
            throw new IllegalArgumentException("Cannot Equip: " + weapon);
        }
    }

    @Override
    public Transform getPosition() {
        return this.position;
    }

    @Override
    public Vector getVelocity() {
        return this.velocity;
    }

    @Override
    public void moveTo(long x, long y) {
        this.position = new Transform(x, y);
    }

    @Override
    public void startMove(long velX, long velY) {
        this.velocity = new Vector(velX, velY);
    }

    @Override
    public void stopMove() {
        this.velocity = Vector.ZERO;
    }

    @Override
    public boolean isMoving() {
        return this.velocity.getX() != 0 || this.velocity.getY() != 0;
    }
}
