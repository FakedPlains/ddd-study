package cloud.zfwproject.ddd.demo.bank.domain.service;

import cloud.zfwproject.ddd.demo.bank.domain.model.entity.Account;
import cloud.zfwproject.ddd.demo.type.ExchangeRate;
import cloud.zfwproject.ddd.demo.type.Money;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/16 5:48 PM
 */
public interface IAccountTransferService {

    void transfer(Account sourceAccount, Account targerAccount, Money targetMoney, ExchangeRate exchangeRate);

}
