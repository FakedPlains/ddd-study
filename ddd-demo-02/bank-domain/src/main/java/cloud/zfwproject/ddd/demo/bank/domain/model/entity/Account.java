package cloud.zfwproject.ddd.demo.bank.domain.model.entity;

import cloud.zfwproject.ddd.demo.bank.exception.DailyLimitExceededException;
import cloud.zfwproject.ddd.demo.bank.exception.InsufficientFundsException;
import cloud.zfwproject.ddd.demo.exception.InvalidCurrencyException;
import cloud.zfwproject.ddd.demo.type.AccountId;
import cloud.zfwproject.ddd.demo.type.AccountNumber;
import cloud.zfwproject.ddd.demo.type.Currency;
import cloud.zfwproject.ddd.demo.type.Money;
import cloud.zfwproject.ddd.demo.type.UserId;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/16 5:01 PM
 */
public class Account {

    private AccountId accountId;

    private AccountNumber accountNumber;

    private UserId userId;

    private Money available;

    private Money dailyLimit;

    /**
     * 转出
     *
     * @param money
     */
    public void withdraw(Money money) {
        if (this.available.compareTo(money) < 0) {
            throw new InsufficientFundsException();
        }
        if (this.dailyLimit.compareTo(money) < 0) {
            throw new DailyLimitExceededException();
        }
        this.available = this.available.subtract(money);
    }

    /**
     * 转入
     *
     * @param money
     */
    public void deposit(Money money) {
        if (!this.getCurrency().equals(money.getCurrency())) {
            throw new InvalidCurrencyException();
        }
        this.available = this.available.add(money);
    }

    public Currency getCurrency() {
        return this.available.getCurrency();
    }

}
