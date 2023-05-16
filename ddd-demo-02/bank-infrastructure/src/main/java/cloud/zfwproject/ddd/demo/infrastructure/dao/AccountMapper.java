package cloud.zfwproject.ddd.demo.infrastructure.dao;

import cloud.zfwproject.ddd.demo.infrastructure.dataobject.AccountDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/16 5:13 PM
 */
@Mapper
public interface AccountMapper {

    void insert(AccountDO account);

    void update(AccountDO account);

    AccountDO selectById(@Param("id") Long id);

    AccountDO selectByAccountNumber(@Param("accountNumber") String accountNumber);

    AccountDO selectByUserId(@Param("userId") Long userId);

}
