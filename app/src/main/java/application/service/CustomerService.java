package application.service;

import application.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    CustomerDTO getCustomerById(String id);
    List<CustomerDTO> getAllCustomers();
    void saveCustomer(CustomerDTO customerDTO);
    void deleteCustomer(String id);
}