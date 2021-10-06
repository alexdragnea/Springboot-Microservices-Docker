package net.dg.userservice.service;

import net.dg.userservice.entity.User;
import net.dg.userservice.vo.ResponseTemplateVO;

public interface UserService {

    User saveUser(User user);
    ResponseTemplateVO getUserWithDepartment(Long userId);
}
