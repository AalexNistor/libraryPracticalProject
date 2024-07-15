package sda.academy.service;

import sda.academy.entity.Customer;
import sda.academy.repository.CustomerRepository;

public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(){
        this.customerRepository = new CustomerRepository();
    }

    public void saveCustomer(Customer customer) {
        customerRepository.saveCustomer(customer);
    }
}
