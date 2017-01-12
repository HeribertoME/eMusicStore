package com.eMusicStore.dao;

import com.eMusicStore.model.Cart;

import java.io.IOException;

/**
 * Created by heriberto on 10/01/17.
 */
public interface CartDao {

    Cart getCartById(int cartId);

    Cart validate(int cartId) throws IOException;

    void update(Cart cart);
}
