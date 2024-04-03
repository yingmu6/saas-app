package com.orange.biz;

import com.orange.biz.bo.UserInfoBO;

/**
 * @author chensy
 * @date 2024/3/30
 */
public interface IUserInfoBiz {

    void addUserInfo(UserInfoBO userInfoBO);

    UserInfoBO getUserInfo(Long id);
}