package cloud.zfwproject.ddd.demo.pojo;

import cloud.zfwproject.ddd.demo.pojo.type.Address;
import cloud.zfwproject.ddd.demo.pojo.type.Name;
import cloud.zfwproject.ddd.demo.pojo.type.PhoneNumber;
import cloud.zfwproject.ddd.demo.pojo.type.RepId;
import cloud.zfwproject.ddd.demo.pojo.type.UserId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/16 4:15 PM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private UserId userId;

    private Name name;

    private PhoneNumber phone;

    private Address address;

    private RepId repId;

}
