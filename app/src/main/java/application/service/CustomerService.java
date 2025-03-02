package application.service;

import application.model.Customer;
import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer getCustomerById(String id);
    void saveCustomer(Customer customer);
    void deleteCustomer(String id);
}