package cloud.zfwproject.ddd.demo.bank.domain.repository;

import cloud.zfwproject.ddd.demo.bank.domain.model.entity.Account;
import cloud.zfwproject.ddd.demo.type.AccountId;
import cloud.zfwproject.ddd.demo.type.AccountNumber;
import cloud.zfwproject.ddd.demo.type.UserId;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/16 5:03 PM
 */
public interface IAccountRepository {

    Account find(AccountId id);

    Account find(AccountNumber accountNumber);

    Account find(UserId userId);

    Account save(Account account);

}
