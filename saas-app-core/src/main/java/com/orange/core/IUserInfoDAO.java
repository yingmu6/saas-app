package com.orange.core;

import com.orange.core.entity.UserInfoDO;

/**
 * @author chensy
 * @date 2024/3/30
 */
public interface IUserInfoDAO {

    void addUserInfo(UserInfoDO userInfoDO);

    UserInfoDO getUserInfoById(Long id);
}