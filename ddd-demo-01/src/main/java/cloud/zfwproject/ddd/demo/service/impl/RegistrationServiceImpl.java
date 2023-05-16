package cloud.zfwproject.ddd.demo.service.impl;

import cloud.zfwproject.ddd.demo.pojo.type.Address;
import cloud.zfwproject.ddd.demo.pojo.type.Name;
import cloud.zfwproject.ddd.demo.pojo.type.PhoneNumber;
import cloud.zfwproject.ddd.demo.pojo.SalesRep;
import cloud.zfwproject.ddd.demo.pojo.User;
import cloud.zfwproject.ddd.demo.repository.SalesRepRepository;
import cloud.zfwproject.ddd.demo.repository.UserRepository;
import cloud.zfwproject.ddd.demo.service.RegistrationService;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/16 4:19 PM
 */
public class RegistrationServiceImpl implements RegistrationService {

    private SalesRepRepository salesRepRepository;
    private UserRepository userRepository;

    @Override
    public User register(Name name, PhoneNumber phone, Address address) {
        // 获取区域内的 Rep
        SalesRep rep = salesRepRepository.findRep(phone.getAreaCode());

        // 创建用户，落库
        User user = new User();
        user.setName(name);
        user.setPhone(phone);
        user.setAddress(address);
        if (rep != null) {
            user.setRepId(rep.getRepId());
        }

        return userRepository.save(user);
    }

}
