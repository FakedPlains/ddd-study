package cloud.zfwproject.ddd.demo.infrastructure.convert;

import cloud.zfwproject.ddd.demo.bank.domain.model.entity.Account;
import cloud.zfwproject.ddd.demo.infrastructure.dataobject.AccountDO;
import org.springframework.stereotype.Component;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/16 5:23 PM
 */
@Component
public class AccountBuilder {

    public Account toAccount(AccountDO accountDO) {
        return null;
    }

    public AccountDO fromAccount(Account account) {
        return null;
    }

}
