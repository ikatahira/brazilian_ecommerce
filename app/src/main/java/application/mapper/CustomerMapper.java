package application.mapper;

import application.dto.CustomerDTO;
import application.model.Customer;

public class CustomerMapper {
    public static CustomerDTO toDTO(Customer customer) {
        if (customer == null) {
            return null;
        }
        return new CustomerDTO(customer.getId(), customer.getName(), customer.getEmail());
    }

    public static Customer toEntity(CustomerDTO customerDTO) {
        if (customerDTO == null) {
            return null;
        }
        return new Customer(customerDTO.getId(), customerDTO.getName(), customerDTO.getEmail());
    }
}