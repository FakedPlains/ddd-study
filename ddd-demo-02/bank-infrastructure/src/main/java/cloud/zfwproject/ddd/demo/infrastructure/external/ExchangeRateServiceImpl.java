package cloud.zfwproject.ddd.demo.infrastructure.external;

import cloud.zfwproject.ddd.demo.bank.external.IExchangeRateService;
import cloud.zfwproject.ddd.demo.type.Currency;
import cloud.zfwproject.ddd.demo.type.ExchangeRate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/16 5:45 PM
 */
@Service
public class ExchangeRateServiceImpl implements IExchangeRateService {

    @Override
    public ExchangeRate getExchangeRate(Currency source, Currency target) {
        if (source.equals(target)) {
            return new ExchangeRate(BigDecimal.ONE, source, target);
        }
        return null;
    }

}
