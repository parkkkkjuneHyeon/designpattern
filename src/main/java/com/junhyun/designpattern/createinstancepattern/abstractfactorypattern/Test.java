package com.junhyun.designpattern.createinstancepattern.abstractfactorypattern;

import com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.domain.product.Product;
import com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.domain.product.dao.ProductDao;
import com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.domain.user.UserInfo;
import com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.domain.user.dao.UserDao;
import com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.factory.DaoFactory;
import com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.factory.mysql.DaoMysqlFactory;
import com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.factory.oracle.DaoOracleFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException {
        DaoFactory factory = null;
        UserDao userDao;
        ProductDao productDao;
        UserInfo userInfo = new UserInfo();
        userInfo.setId(1);
        userInfo.setUserName("aaa");
        userInfo.setPassword("#@#@");
        Product product = new Product();
        product.setId(1);
        product.setName("Mac book");
        product.setDescription("Mac Book Pro");
        product.setPrice(3000000);

        FileInputStream file = new FileInputStream(
                "/Users/User/IdeaProjects/designpattern" +
                        "/src/main/java/com/junhyun/designpattern" +
                        "/createinstancepattern" +
                        "/abstractfactorypattern/db.properties");
        Properties properties = new Properties();
        properties.load(file);

        if(properties.getProperty("dbname").equalsIgnoreCase("MYSQL"))
            factory = new DaoMysqlFactory();
        else if(properties.getProperty("dbname").equalsIgnoreCase("ORACLE"))
            factory = new DaoOracleFactory();
        else
            throw new IllegalArgumentException("해당 DB가 없습니다.");

        userDao = factory.createUserDao();
        productDao = factory.createProductDao();

        userDao.save(userInfo);
        userDao.findById(userInfo.getId());
        userDao.update(userInfo);
        userDao.deleteById(userInfo.getId());

        productDao.save(product);
        productDao.findById(product.getId());
        productDao.update(product);
        productDao.deleteById(product.getId());
    }
}
