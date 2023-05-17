package cloud.zfwproject.ddd.demo.ddd.model.entity;

import cloud.zfwproject.ddd.demo.ddd.model.dp.Health;
import cloud.zfwproject.ddd.demo.ddd.model.dp.MonsterId;
import cloud.zfwproject.ddd.demo.ddd.model.dp.Transform;
import cloud.zfwproject.ddd.demo.ddd.model.dp.Vector;
import cloud.zfwproject.ddd.demo.ddd.model.enums.MonsterClass;
import lombok.Getter;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/17 2:01 PM
 */
@Getter
public class Monster implements Movable {

    private MonsterId id;

    private MonsterClass monsterClass;

    private Health health;

    private Transform position = Transform.ORIGIN;

    private Vector velocity = Vector.ZERO;

    public void takeDamage(int damage) {
        this.health.decreased(damage);
    }

    public boolean isAlive() {
        return this.health.getValue() <= 0;
    }

    @Override
    public Transform getPosition() {
        return null;
    }

    @Override
    public Vector getVelocity() {
        return null;
    }

    @Override
    public void moveTo(long x, long y) {

    }

    @Override
    public void startMove(long velX, long velY) {

    }

    @Override
    public void stopMove() {

    }

    @Override
    public boolean isMoving() {
        return false;
    }
}
