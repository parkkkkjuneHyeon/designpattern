package com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.domain.user.dao;

import com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.domain.user.UserInfo;

public interface UserDao {
    UserInfo save(UserInfo userInfo);
    UserInfo findById(int id);
    void deleteById(int id);
    UserInfo update(UserInfo userInfo);
}
