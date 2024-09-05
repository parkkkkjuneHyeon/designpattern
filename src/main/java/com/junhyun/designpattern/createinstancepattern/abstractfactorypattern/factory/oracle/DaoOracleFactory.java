package com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.factory.oracle;

import com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.domain.product.dao.ProductDao;
import com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.domain.product.dao.mysql.ProductMysqlDao;
import com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.domain.product.dao.oracle.ProductOracleDao;
import com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.domain.user.dao.UserDao;
import com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.domain.user.dao.mysql.UserMysqlDao;
import com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.domain.user.dao.oracle.UserOracleDao;
import com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.factory.DaoFactory;

public class DaoOracleFactory implements DaoFactory {

    @Override
    public UserDao createUserDao() {
        return new UserOracleDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductOracleDao();
    }
}
