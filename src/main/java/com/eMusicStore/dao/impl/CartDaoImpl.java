package com.eMusicStore.dao.impl;

import com.eMusicStore.dao.CartDao;
import com.eMusicStore.model.Cart;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by heriberto on 10/01/17.
 */
@Repository
public class CartDaoImpl implements CartDao {

    private Map<String, Cart> listOfCarts;

    public CartDaoImpl() {
        listOfCarts = new HashMap<String, Cart>();
    }

    public Cart create(Cart cart) {
        if (listOfCarts.keySet().contains(cart.getCartId())) {
            throw new IllegalArgumentException(String.format("Can not create a cart. A cart with the given id(%) " +
                    "already " + "exists", cart.getCartId()));
        }

        listOfCarts.put(cart.getCartId(), cart);

        return cart;
    }

    public Cart read(String cartId) {
        return listOfCarts.get(cartId);
    }

    public void update(String cartId, Cart cart) {
        if (!listOfCarts.keySet().contains(cartId)) {
            throw new IllegalArgumentException(String.format("Can not update a cart. The cart with the given id(%) " +
                    "does not " + "exist", cart.getCartId()));
        }

        listOfCarts.put(cartId, cart);
    }

    public void delete(String cartId) {
        if (!listOfCarts.keySet().contains(cartId)) {
            throw new IllegalArgumentException(String.format("Cannot delete cart. The cart with the given id(%) " +
                    "does not " +
                    "exist", cartId));
        }

        listOfCarts.remove(cartId);
    }
}
