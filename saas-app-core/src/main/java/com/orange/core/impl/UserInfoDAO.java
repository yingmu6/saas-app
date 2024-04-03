package com.orange.core.impl;

import com.orange.core.IUserInfoDAO;
import com.orange.core.entity.UserInfoDO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chensy
 * @date 2024/3/30
 */
@Repository
public class UserInfoDAO extends BaseDAO<UserInfoDO> implements IUserInfoDAO {

    @Override
    public void addUserInfo(UserInfoDO userInfoDO) {
        this.add(userInfoDO);
    }

    @Override
    public UserInfoDO getUserInfoById(Long id) {
        return this.getById(id);
    }
}
