package com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.factory;

import com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.domain.product.dao.ProductDao;
import com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.domain.user.dao.UserDao;

public interface DaoFactory {
    UserDao createUserDao();
    ProductDao createProductDao();
}
