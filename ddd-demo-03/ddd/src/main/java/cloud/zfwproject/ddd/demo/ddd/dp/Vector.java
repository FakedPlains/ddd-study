package cloud.zfwproject.ddd.demo.ddd.dp;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/17 2:06 PM
 */
public class Vector {

    private long x;
    private long y;

    public static Vector ZERO = new Vector(0, 0);

    public Vector(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }
}
