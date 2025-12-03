package com.example.ecom.customer.repository;

import com.example.ecom.customer.model.Customer;
import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> findCustomersByEmail(String email);
}
