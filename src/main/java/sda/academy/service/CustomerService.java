package sda.academy.service;

import sda.academy.dto.CustomerDTO;
import sda.academy.entity.Customer;
import sda.academy.repository.CustomerRepository;
import sda.academy.util.MapperUtil;

public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(){
        this.customerRepository = new CustomerRepository();
    }

    public void saveCustomer(CustomerDTO customerDTO) {
        Customer customer1 = MapperUtil.convertCustomerDtoToEntity(customerDTO);
        customerRepository.saveCustomer(customer1);
    }
}
