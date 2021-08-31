package com.jiashn.smartdoc.service.impl;

import com.jiashn.smartdoc.entity.User;
import com.jiashn.smartdoc.service.UserManageService;
import com.jiashn.smartdoc.utils.ResultJson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


/**
 * @author: jiangjs
 */
@Service
public class UserManageServiceImpl implements UserManageService {

    private static final Logger logger = LoggerFactory.getLogger(UserManageServiceImpl.class);
    @Override
    public ResultJson<User> login(User user) {
        logger.info("登录成功");
        return ResultJson.success(user);
    }
}
