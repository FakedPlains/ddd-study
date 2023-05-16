package cloud.zfwproject.ddd.demo.type;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/16 4:55 PM
 */
public class AccountId {

    Long value;

    public AccountId(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return this.value;
    }

}
