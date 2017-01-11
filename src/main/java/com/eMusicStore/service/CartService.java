package com.eMusicStore.service;

import com.eMusicStore.model.Cart;

/**
 * Created by heriberto on 11/01/17.
 */
public interface CartService {

    Cart getCartById(int cartId);

    void update(Cart cart);
}
