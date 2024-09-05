package com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.domain.user.dao.oracle;

import com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.domain.user.UserInfo;
import com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.domain.user.dao.UserDao;

public class UserOracleDao implements UserDao {
    @Override
    public UserInfo save(UserInfo userInfo) {
        System.out.println("Oracle 쿼리로 저장 완료");
        return userInfo;
    }

    @Override
    public UserInfo findById(int id) {
        System.out.println("Oracle 쿼리로 UserInfo 찾기 완료");
        return null;
    }

    @Override
    public void deleteById(int id) {
        System.out.println("Oracle 쿼리로 삭제 완료");
    }

    @Override
    public UserInfo update(UserInfo userInfo) {
        System.out.println("Oracle 쿼리로 업데이트 완료");
        return userInfo;
    }
}
