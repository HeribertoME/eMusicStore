package com.eMusicStore.dao;

import com.eMusicStore.model.Customer;

import java.util.List;

/**
 * Created by heriberto on 11/01/17.
 */
public interface CustomerDao {

    void addCustomer(Customer customer);

    Customer getCustomerById(int customerId);

    List<Customer> getAllCustomers();
}
