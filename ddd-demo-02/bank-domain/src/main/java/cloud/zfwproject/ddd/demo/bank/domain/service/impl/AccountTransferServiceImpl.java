package cloud.zfwproject.ddd.demo.bank.domain.service.impl;

import cloud.zfwproject.ddd.demo.bank.domain.model.entity.Account;
import cloud.zfwproject.ddd.demo.bank.domain.service.IAccountTransferService;
import cloud.zfwproject.ddd.demo.type.ExchangeRate;
import cloud.zfwproject.ddd.demo.type.Money;
import org.springframework.stereotype.Service;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/16 5:49 PM
 */
@Service
public class AccountTransferServiceImpl implements IAccountTransferService {

    @Override
    public void transfer(Account sourceAccount, Account targerAccount, Money targetMoney, ExchangeRate exchangeRate) {
        Money sourceMoney = exchangeRate.exchange(targetMoney);
        sourceAccount.deposit(sourceMoney);
        targerAccount.withdraw(targetMoney);
    }

}
