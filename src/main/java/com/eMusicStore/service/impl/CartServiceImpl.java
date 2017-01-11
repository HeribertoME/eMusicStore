package com.eMusicStore.service.impl;

import com.eMusicStore.dao.CartDao;
import com.eMusicStore.model.Cart;
import com.eMusicStore.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by heriberto on 11/01/17.
 */

@Service
public class CartServiceImpl implements CartService{

    @Autowired
    private CartDao cartDao;

    public Cart getCartById(int cartId) {
        return cartDao.getCartById(cartId);
    }

    public void update(Cart cart) {
        cartDao.update(cart);
    }
}
