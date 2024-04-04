package com.orange.api;

import com.orange.api.common.SaaSRequestContext;

/**
 * @author chensy
 * @date 2024/3/30
 */
@SaaSRequestContext(type = "userInfo")
public interface IUserInfoApi {

    @SaaSRequestContext(path = "/user/info/api", action = "get")
    String getUserInfo(Long id);
}