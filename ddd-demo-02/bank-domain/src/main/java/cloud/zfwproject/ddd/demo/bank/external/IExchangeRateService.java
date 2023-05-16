package cloud.zfwproject.ddd.demo.bank.external;

import cloud.zfwproject.ddd.demo.type.Currency;
import cloud.zfwproject.ddd.demo.type.ExchangeRate;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/16 5:45 PM
 */
public interface IExchangeRateService {

    ExchangeRate getExchangeRate(Currency source, Currency target);

}
