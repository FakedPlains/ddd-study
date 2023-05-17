package cloud.zfwproject.ddd.demo.ddd.entity;

import cloud.zfwproject.ddd.demo.ddd.dp.Transform;
import cloud.zfwproject.ddd.demo.ddd.dp.Vector;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/17 2:00 PM
 */
public interface Movable {

    Transform getPosition();
    Vector getVelocity();

    void moveTo(long x, long y);
    void startMove(long velX, long velY);
    void stopMove();
    boolean isMoving();

}
