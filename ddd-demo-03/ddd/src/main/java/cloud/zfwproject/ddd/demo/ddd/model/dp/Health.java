package cloud.zfwproject.ddd.demo.ddd.model.dp;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/17 2:10 PM
 */
public class Health {

    private Integer value;

    public Health(Integer value) {
        this.value = value;
    }

    public void decreased(int value) {
        this.value -= value;
    }

    public Integer getValue() {
        return value;
    }

}
