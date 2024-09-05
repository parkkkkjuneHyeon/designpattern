package com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.domain.product.dao.mysql;

import com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.domain.product.Product;
import com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.domain.product.dao.ProductDao;

public class ProductMysqlDao implements ProductDao {
    @Override
    public Product save(Product product) {
        System.out.println("MySQL 쿼리로 product 저장 완료");
        return product;
    }

    @Override
    public Product findById(int id) {
        System.out.println("MySQL 쿼리로 product 찾기 완료");
        Product product = new Product();
        product.setId(id);
        return product;
    }

    @Override
    public void deleteById(int id) {
        System.out.println("MySQL 쿼리로 product 삭제 완료");
    }

    @Override
    public Product update(Product product) {
        System.out.println("MySQL 쿼리로 product 수정 완료");
        return product;
    }
}
