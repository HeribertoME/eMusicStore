package com.eMusicStore.controller;

import com.eMusicStore.model.BillingAddress;
import com.eMusicStore.model.Customer;
import com.eMusicStore.model.ShippingAddress;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by heriberto on 11/01/17.
 */

@Controller
public class RegisterController {

    @RequestMapping("/register")
    public String registerCustomer(Model model) {

        Customer customer = new Customer();
        BillingAddress billingAddress = new BillingAddress();
        ShippingAddress shippingAddress = new ShippingAddress();
        customer.setBillingAddress(billingAddress);
        customer.setShippingAddress(shippingAddress);

        model.addAttribute("customer", customer);

        return "registerCustomer";
    }

    @RequestMapping("/register")
    public String resgisterCustomerPost(@ModelAttribute("customer") Customer customer, Model model) {

        customer.setEnabled(true);
        // TODO: customerService.addCustomer(customer);

        return "registerCustomerSuccess";

    }
}
