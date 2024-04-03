package com.orange.biz.impl;

import com.orange.biz.IUserInfoBiz;
import com.orange.biz.bo.UserInfoBO;
import com.orange.core.IUserInfoDAO;
import com.orange.core.entity.UserInfoDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author chensy
 * @date 2024/3/30
 */
@Service("userInfoBiz")
public class UserInfoBizImpl implements IUserInfoBiz {

    @Resource
    private IUserInfoDAO userInfoDAO;

    @Override
    public void addUserInfo(UserInfoBO userInfoBO) {
        UserInfoDO userInfoDO = new UserInfoDO();
        userInfoDO.setId(userInfoBO.getId());
        userInfoDO.setName(userInfoBO.getName());
        userInfoDO.setAge(userInfoBO.getAge());

        long curTime = System.currentTimeMillis() / 1000;
        userInfoDO.setGmtCreate(curTime);
        userInfoDO.setGmtModified(curTime);

        userInfoDAO.addUserInfo(userInfoDO);
    }

    @Override
    public UserInfoBO getUserInfo(Long id) {

        UserInfoDO userInfoDO = userInfoDAO.getUserInfoById(id);
        UserInfoBO userInfoBO = new UserInfoBO();
        userInfoBO.setId(userInfoDO.getId());
        userInfoBO.setName(userInfoDO.getName());
        userInfoBO.setAge(userInfoDO.getAge());
        return userInfoBO;
    }
}
