package com.eMusicStore.dao;

import com.eMusicStore.model.Cart;

/**
 * Created by heriberto on 10/01/17.
 */
public interface CartDao {

    Cart getCartById(int cartId);

    void update(Cart cart);
}
