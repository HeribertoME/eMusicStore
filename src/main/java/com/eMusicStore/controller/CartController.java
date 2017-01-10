package com.eMusicStore.controller;

import com.eMusicStore.dao.CartDao;
import com.eMusicStore.dao.ProductDao;
import com.eMusicStore.model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by heriberto on 10/01/17.
 */

@Controller
@RequestMapping("/rest/cart")
public class CartController {

    @Autowired
    private CartDao cartDao;

    @Autowired
    private ProductDao productDao;

    @RequestMapping(value = "/{cartId}", method = RequestMethod.GET)
    public @ResponseBody Cart read (@PathVariable( value = "cartId") String cartId) {
        return cartDao.read(cartId);
    }
}
