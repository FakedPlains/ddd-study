package cloud.zfwproject.ddd.demo.bank.messaging;

import cloud.zfwproject.ddd.demo.bank.domain.model.message.AuditMessage;
import cloud.zfwproject.ddd.demo.bank.domain.model.res.SendResult;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/16 5:54 PM
 */
public interface IAuditMessageProducer {

    SendResult send(AuditMessage message);

}
