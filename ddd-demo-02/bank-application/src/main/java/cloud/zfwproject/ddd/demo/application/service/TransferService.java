package cloud.zfwproject.ddd.demo.application.service;

import java.math.BigDecimal;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/16 6:35 PM
 */
public interface TransferService {

    void transfer(Long sourceUserId, String targetAccountNumber, BigDecimal targetAmount, String targetCurrency);

}
