package com.example.ecom.customer.controller;

import com.example.ecom.common.dto.ApiResponse;
import com.example.ecom.customer.model.Customer;
import com.example.ecom.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    public ApiResponse<List<Customer>> getAllCustomers() {
        return ApiResponse.success(customerRepository.findAll());
    }

    @PostMapping
    public ApiResponse<Customer> createCustomer(@RequestBody Customer customer) {
        return ApiResponse.success(customerRepository.save(customer));
    }

    @GetMapping("/{id}")
    public ApiResponse<Customer> getCustomer(@PathVariable Long id) {
        return customerRepository.findById(id)
                .map(ApiResponse::success)
                .orElse(ApiResponse.error("Customer not found"));
    }
}
