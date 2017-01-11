package com.eMusicStore.service;

import com.eMusicStore.model.CustomerOrder;

/**
 * Created by heriberto on 11/01/17.
 */
public interface CustomerOrderService {

    void addCustomerOrder(CustomerOrder customerOrder);

    double getCostumerOrderGrandTotal(int cartId);
}
