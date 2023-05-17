package cloud.zfwproject.ddd.demo.infrastructure.repository;

import cloud.zfwproject.ddd.demo.bank.domain.model.entity.Account;
import cloud.zfwproject.ddd.demo.bank.domain.repository.IAccountRepository;
import cloud.zfwproject.ddd.demo.infrastructure.convert.AccountBuilder;
import cloud.zfwproject.ddd.demo.infrastructure.dao.AccountMapper;
import cloud.zfwproject.ddd.demo.infrastructure.dataobject.AccountDO;
import cloud.zfwproject.ddd.demo.type.AccountId;
import cloud.zfwproject.ddd.demo.type.AccountNumber;
import cloud.zfwproject.ddd.demo.type.UserId;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/16 5:11 PM
 */
@Repository("accountRepository")
public class AccountRepositoryImpl implements IAccountRepository {

    @Resource
    private AccountMapper accountMapper;

    @Resource
    private AccountBuilder accountBuilder;

    @Override
    public void attach(Account aggregate) {

    }

    @Override
    public void detach(Account aggregate) {

    }

    @Override
    public Account find(AccountId id) {
        AccountDO accountDO = accountMapper.selectById(id.getValue());
        return accountBuilder.toAccount(accountDO);
    }

    @Override
    public void remove(Account aggregate) {

    }

    @Override
    public Account find(AccountNumber accountNumber) {
        AccountDO accountDO = accountMapper.selectByAccountNumber(accountNumber.getValue());
        return accountBuilder.toAccount(accountDO);
    }

    @Override
    public Account find(UserId userId) {
        AccountDO accountDO = accountMapper.selectByUserId(userId.getValue());
        return accountBuilder.toAccount(accountDO);
    }

    @Override
    public Account save(Account account) {
        AccountDO accountDO = accountBuilder.fromAccount(account);
        if (accountDO.getId() == null) {
            accountMapper.insert(accountDO);
        } else {
            accountMapper.update(accountDO);
        }
        return accountBuilder.toAccount(accountDO);
    }

}
