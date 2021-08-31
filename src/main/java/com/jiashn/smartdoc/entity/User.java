package com.jiashn.smartdoc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author: jiangjs
 */
@Data
@Accessors(chain = true)
public class User {
    /**
     * 登录用户名称
     */
    private String loginName;
    /**
     * 登录密码
     */
    private String passWord;
}
