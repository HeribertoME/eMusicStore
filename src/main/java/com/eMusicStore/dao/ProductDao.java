package com.eMusicStore.dao;

import com.eMusicStore.model.Product;

import java.util.List;

/**
 * Created by heriberto on 05/01/17.
 */
public interface ProductDao {

    void addProduct(Product product);

    Product getProductById(String id);

    List<Product> getAllProducts();

    void deleteProduct(String id);
}
