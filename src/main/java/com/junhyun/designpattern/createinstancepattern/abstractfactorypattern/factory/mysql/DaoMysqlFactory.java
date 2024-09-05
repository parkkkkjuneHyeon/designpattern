package com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.factory.mysql;

import com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.domain.product.dao.ProductDao;
import com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.domain.product.dao.mysql.ProductMysqlDao;
import com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.domain.user.dao.UserDao;
import com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.domain.user.dao.mysql.UserMysqlDao;
import com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.factory.DaoFactory;

public class DaoMysqlFactory implements DaoFactory {

    @Override
    public UserDao createUserDao() {
        return new UserMysqlDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductMysqlDao();
    }
}
