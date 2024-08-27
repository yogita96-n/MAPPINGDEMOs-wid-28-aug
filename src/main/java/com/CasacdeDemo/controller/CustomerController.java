package com.CasacdeDemo.controller;

import com.CasacdeDemo.entity.Customer;
import com.CasacdeDemo.repo.CustomerRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")

public class CustomerController {

    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @PostMapping("/add")
    public String addDetails(@RequestBody Customer customer){
        customerRepository.save(customer);
        return "added";
    }
    @DeleteMapping("/delete")
public String deleteDetails(@RequestParam int cId){
        customerRepository.deleteById(cId);
        return "deleted";
    }
}
