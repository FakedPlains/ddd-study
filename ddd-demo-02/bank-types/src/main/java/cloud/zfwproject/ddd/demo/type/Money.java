package cloud.zfwproject.ddd.demo.type;

import java.math.BigDecimal;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/16 4:56 PM
 */
public class Money implements Comparable<Money> {

    private BigDecimal amount;

    private Currency currency;

    public Money(BigDecimal amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money add(Money money) {
        BigDecimal amount = this.amount.add(money.getAmount());
        return new Money(amount, this.currency);
    }

    public Money subtract(Money money) {
        BigDecimal amount = this.amount.subtract(money.getAmount());
        return new Money(amount, this.currency);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public int compareTo(Money money) {
        return this.amount.compareTo(money.getAmount());
    }
}
