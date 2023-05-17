package cloud.zfwproject.ddd.demo.type;

import cloud.zfwproject.ddd.demo.repository.Identifier;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/16 4:55 PM
 */
public class UserId implements Identifier {

    Long value;

    public UserId(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return this.value;
    }

}
