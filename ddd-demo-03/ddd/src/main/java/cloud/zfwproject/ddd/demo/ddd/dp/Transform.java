package cloud.zfwproject.ddd.demo.ddd.dp;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/17 2:06 PM
 */
public class Transform {

    private long x;
    private long y;

    public static Transform ORIGIN = new Transform(0, 0);

    public Transform(long x, long y) {
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
