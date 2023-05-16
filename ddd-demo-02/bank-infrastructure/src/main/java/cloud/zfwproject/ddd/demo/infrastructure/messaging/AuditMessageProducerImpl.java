package cloud.zfwproject.ddd.demo.infrastructure.messaging;

import cloud.zfwproject.ddd.demo.bank.domain.model.message.AuditMessage;
import cloud.zfwproject.ddd.demo.bank.domain.model.res.SendResult;
import cloud.zfwproject.ddd.demo.bank.messaging.IAuditMessageProducer;
import org.springframework.stereotype.Repository;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/16 5:57 PM
 */
@Repository
public class AuditMessageProducerImpl implements IAuditMessageProducer {

    private static final String TOPIC_AUDIT_LOG = "TOPIC_AUDIT_LOG";

    @Override
    public SendResult send(AuditMessage message) {

        return SendResult.success();
    }

}
