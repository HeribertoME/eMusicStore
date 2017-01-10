package com.eMusicStore.dao;

import com.eMusicStore.model.Cart;

/**
 * Created by heriberto on 10/01/17.
 */
public interface CartDao {

    Cart create(Cart cart);

    Cart read(String cartId);

    void update(String cartId, Cart cart);

    void delete(String cartId);
}
