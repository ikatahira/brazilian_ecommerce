// CustomerServiceImpl.java
package application.service.impl;

import application.dto.CustomerDTO;
import application.model.Customer;
import application.repository.CustomerRepository;
import application.service.CustomerService;
import application.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public CustomerDTO getCustomerById(String id) {
        Customer customer = customerRepository.findById(id).orElse(null);
        return (customer != null) ? CustomerMapper.toDTO(customer) : null;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        return customers.stream()
                .map(CustomerMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public void saveCustomer(CustomerDTO customerDTO) {
        Customer customer = CustomerMapper.toEntity(customerDTO);
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(String id) {
        customerRepository.deleteById(id);
    }

    @Override
    public void updateCustomer(String id, CustomerDTO customerDTO) {
        Customer customer = customerRepository.findById(id).orElse(null);
        if (customer != null) {
            Customer updatedCustomer = CustomerMapper.toEntity(customerDTO);
            updatedCustomer.setCustomerId(customer.getCustomerId());
            customerRepository.save(updatedCustomer);
        }
    }
}