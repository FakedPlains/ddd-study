package cloud.zfwproject.ddd.demo.service;

import cloud.zfwproject.ddd.demo.pojo.type.Address;
import cloud.zfwproject.ddd.demo.pojo.type.Name;
import cloud.zfwproject.ddd.demo.pojo.type.PhoneNumber;
import cloud.zfwproject.ddd.demo.pojo.User;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/16 4:18 PM
 */
public interface RegistrationService {

    User register(Name name, PhoneNumber phone, Address address);

}
