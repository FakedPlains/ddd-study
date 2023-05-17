package cloud.zfwproject.ddd.demo.ddd.entity;

import cloud.zfwproject.ddd.demo.ddd.dp.Health;
import cloud.zfwproject.ddd.demo.ddd.dp.MonsterId;
import cloud.zfwproject.ddd.demo.ddd.dp.Transform;
import cloud.zfwproject.ddd.demo.ddd.dp.Vector;
import cloud.zfwproject.ddd.demo.ddd.enums.MonsterClass;
import com.sun.xml.internal.ws.api.message.Header;
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
