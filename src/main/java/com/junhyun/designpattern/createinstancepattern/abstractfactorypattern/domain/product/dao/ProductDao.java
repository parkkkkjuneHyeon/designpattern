package com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.domain.product.dao;

import com.junhyun.designpattern.createinstancepattern.abstractfactorypattern.domain.product.Product;

public interface ProductDao {
    Product save(Product product);
    Product findById(int id);
    void deleteById(int id);
    Product update(Product product);
}
