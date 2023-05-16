package cloud.zfwproject.ddd.demo.infrastructure.dataobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/16 5:18 PM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDO {

    private Long id;

    private String accountNumber;

    private Long userId;

    private BigDecimal available;

    private BigDecimal dailyLimit;

}
