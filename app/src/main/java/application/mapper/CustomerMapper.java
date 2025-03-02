package application.mapper;

import application.dto.CustomerDTO;
import application.model.Customer;

public class CustomerMapper {
    public static CustomerDTO toDTO(Customer customer) {
        if (customer == null) return null;
        return new CustomerDTO(
            customer.getCustomerId(),
            customer.getCustomerUniqueId(),
            customer.getCustomerZipCodePrefix(),
            customer.getCustomerCity(),
            customer.getCustomerState()
        );
    }

    public static Customer toEntity(CustomerDTO dto) {
        if (dto == null) return null;
        return new Customer(
            dto.getCustomerId(),
            dto.getCustomerUniqueId(),
            dto.getCustomerZipCodePrefix(),
            dto.getCustomerCity(),
            dto.getCustomerState()
        );
    }
}