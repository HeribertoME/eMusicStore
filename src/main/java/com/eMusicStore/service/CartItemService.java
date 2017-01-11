package com.eMusicStore.service;

import com.eMusicStore.model.Cart;
import com.eMusicStore.model.CartItem;

/**
 * Created by heriberto on 11/01/17.
 */
public interface CartItemService {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);
}
