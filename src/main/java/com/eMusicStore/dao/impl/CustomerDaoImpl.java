package com.eMusicStore.dao.impl;

import com.eMusicStore.dao.CustomerDao;
import com.eMusicStore.model.Authorities;
import com.eMusicStore.model.Cart;
import com.eMusicStore.model.Customer;
import com.eMusicStore.model.Users;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by heriberto on 11/01/17.
 */

@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao{

    @Autowired
    private SessionFactory sessionFactory;

    public void addCustomer(Customer customer) {
        Session session = sessionFactory.getCurrentSession();

        customer.getBillingAddress().setCustomer(customer);
        customer.getShippingAddress().setCustomer(customer);

        session.saveOrUpdate(customer);
        session.saveOrUpdate(customer.getBillingAddress());
        session.saveOrUpdate(customer.getShippingAddress());

        Users newUser = new Users();
        newUser.setUsername(customer.getUsername());
        newUser.setPassword(customer.getPassword());
        newUser.setEnabled(true);
        newUser.setCustomerId(customer.getCustomerId());

        Authorities newAuthority = new Authorities();
        newAuthority.setUsername(customer.getUsername());
        newAuthority.setAuthority("ROLE_USER");
        session.saveOrUpdate(newAuthority);

        Cart newCart = new Cart();
        newCart.setCustomer(customer);
        customer.setCart(newCart);
        session.saveOrUpdate(customer);
        session.saveOrUpdate(newCart);

        session.flush();
    }

    public Customer getCustomerById(int customerId) {
        Session session = sessionFactory.getCurrentSession();
        return (Customer) session.get(Customer.class, customerId);
    }

    public List<Customer> getAllCustomers() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Customer");
        List<Customer> customerList = query.list();

        return customerList;
    }
}
