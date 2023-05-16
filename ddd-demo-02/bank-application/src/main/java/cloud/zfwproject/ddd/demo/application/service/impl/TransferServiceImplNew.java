package cloud.zfwproject.ddd.demo.application.service.impl;

import cloud.zfwproject.ddd.demo.application.service.TransferService;
import cloud.zfwproject.ddd.demo.bank.domain.model.entity.Account;
import cloud.zfwproject.ddd.demo.bank.domain.model.message.AuditMessage;
import cloud.zfwproject.ddd.demo.bank.domain.repository.IAccountRepository;
import cloud.zfwproject.ddd.demo.bank.messaging.IAuditMessageProducer;
import cloud.zfwproject.ddd.demo.bank.domain.service.IAccountTransferService;
import cloud.zfwproject.ddd.demo.bank.external.IExchangeRateService;
import cloud.zfwproject.ddd.demo.type.AccountNumber;
import cloud.zfwproject.ddd.demo.type.Currency;
import cloud.zfwproject.ddd.demo.type.ExchangeRate;
import cloud.zfwproject.ddd.demo.type.Money;
import cloud.zfwproject.ddd.demo.type.UserId;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/16 6:36 PM
 */
@Service
public class TransferServiceImplNew implements TransferService {

    @Resource
    private IAccountRepository accountRepository;
    @Resource
    private IAuditMessageProducer auditMessageProducer;
    @Resource
    private IExchangeRateService exchangeRateService;
    @Resource
    private IAccountTransferService accountTransferService;

    @Override
    public void transfer(Long sourceUserId, String targetAccountNumber, BigDecimal targetAmount, String targetCurrency) {
        // 数据校验
        Money targetMoney = new Money(targetAmount, new Currency(targetCurrency));

        // 读数据
        Account sourceAccount = accountRepository.find(new UserId(sourceUserId));
        Account targetAccount = accountRepository.find(new AccountNumber(targetAccountNumber));
        ExchangeRate exchangeRate = exchangeRateService.getExchangeRate(sourceAccount.getCurrency(), targetAccount.getCurrency());

        // 业务逻辑
        accountTransferService.transfer(sourceAccount, targetAccount, targetMoney, exchangeRate);

        // 保存数据
        accountRepository.save(sourceAccount);
        accountRepository.save(targetAccount);

        // 发送审计消息
        AuditMessage auditMessage = new AuditMessage();
        auditMessageProducer.send(auditMessage);
    }

}
