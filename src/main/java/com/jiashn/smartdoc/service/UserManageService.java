package com.jiashn.smartdoc.service;

import com.jiashn.smartdoc.entity.User;
import com.jiashn.smartdoc.utils.ResultJson;

/**
 * @author: jiangjs
 */
public interface UserManageService {

    /**
     *
     * 用户登录
     * @param user 用户实体
     * @return 登录结果
     */
    ResultJson<User> login(User user);
}
