package com.eMusicStore.service;

import com.eMusicStore.model.Customer;

import java.util.List;

/**
 * Created by heriberto on 11/01/17.
 */
public interface CustomerService {

    void addCustomer(Customer customer);

    Customer getCustomerById(int customerId);

    List<Customer> getAllCustomers();
}
