package cloud.zfwproject.ddd.demo.bank.domain.model.message;

import cloud.zfwproject.ddd.demo.type.AccountNumber;
import cloud.zfwproject.ddd.demo.type.Money;
import cloud.zfwproject.ddd.demo.type.UserId;

import java.time.LocalDateTime;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/16 5:52 PM
 */
public class AuditMessage {

    private UserId userId;

    private AccountNumber source;

    private AccountNumber target;

    private Money money;

    private LocalDateTime date;

    public String serialize() {
        return "";
    }

    public static AuditMessage deserialize() {
        return null;
    }

}
